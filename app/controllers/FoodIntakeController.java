package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.Security.Authenticator;
import dao.FoodDao;
import dao.FoodIntakeDao;
import models.Food;
import models.FoodIntake;
import models.User;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FoodIntakeController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(FoodIntakeController.class);

    private FoodDao foodDao;

    private FoodIntakeDao foodIntakeDao;

    @Inject
    public FoodIntakeController(FoodDao foodDao, FoodIntakeDao foodIntake) {
        this.foodDao = foodDao;
        this.foodIntakeDao = foodIntake;
    }

    @Transactional
    @Authenticator
    public Result createFoodIntake() {

        final JsonNode json = request().body().asJson();

        final User user = (User) ctx().args.get("user");

        final List<FoodIntake> intakes = new ArrayList<>();
        if (!json.isArray()) {
            return badRequest("please enter food items");
        }

        for (JsonNode node : json) {
            final FoodIntake intake = Json.fromJson(node, FoodIntake.class);

            //LOGGER.debug("food id {}", node.get("foodId"));

            final Integer foodId = node.get("foodId").asInt();
            final Optional<Food> optionalFood = foodDao.read(foodId);
            if(!optionalFood.isPresent()){
                return badRequest("No food found");
            }
            final Food food = optionalFood.get();
            intake.setFood(food);

            intake.setUser(user);

            intakes.add(intake);

        }

        if (intakes.isEmpty()) {
            return badRequest();
        }

       // LOGGER.debug("Intakes {} ",intakes);

        final Collection<FoodIntake> newIntake = foodIntakeDao.createFoodIntake(intakes);

        final JsonNode result = Json.toJson(newIntake);

        return ok(result);

    }

    @Transactional
    @Authenticator
    public  Result deleteFoodIntakeById(Integer Id) {

        final User user = (User) ctx().args.get("user");

        if (null == Id) {
            return badRequest("Id must be provided");
        }

        final FoodIntake foodIntake = foodIntakeDao.delete(Id);

        final JsonNode result = Json.toJson(foodIntake);
        return ok(result);

    }

    @Transactional
    @Authenticator
    public Result getAllFoodIntake(String startDate, String endDate) {

        final User user = (User) ctx().args.get("user");

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            Date sDate = formatter.parse(startDate);
            //LOGGER.debug("sDate :{}", sDate);

            Date eDate = formatter.parse(endDate);
            //LOGGER.debug("end Date :{}",eDate);

            Date date = new Date();
            //LOGGER.debug(" in date:{}", date);

            if (sDate.after(date) || eDate.after(date)) {
                return badRequest();
            }

            //LOGGER.debug("date:{}", date);

            Collection<FoodIntake> stats = foodIntakeDao.getAllFoodIntake(sDate,eDate,user);

            final JsonNode result = Json.toJson(stats);

            return ok(result);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return ok();
    }


    @Authenticator
    @Transactional
    public Result getStats(String startDate, String endDate){

        final User user = (User) ctx().args.get("user");

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            Date sDate = formatter.parse(startDate);
            //LOGGER.debug("start Date :{}",sDate);

            Date eDate = formatter.parse(endDate);
            //LOGGER.debug("end Date :{}",eDate);

            Collection<FoodIntake> stats = foodIntakeDao.getStats(sDate, eDate,user);

            HashMap<String,Integer> logs = new HashMap<>();
            for(FoodIntake item:stats) {

                final Integer quantity = item.getQuantity();
                final Integer calorie = item.food.getCalories();
                final Date date = item.getDate();
                final String dateString = formatter.format(date);

                Integer calorieCount = quantity * calorie;
                //LOGGER.debug("calorie count :{}", calorieCount);

                Integer oldVal = logs.get(dateString);

                if (null == oldVal) {
                    logs.put(dateString, calorieCount);
                } else {
                    logs.put(dateString, calorieCount + oldVal);
                }

            }
            final JsonNode result = Json.toJson(logs);
            return ok(result);


        } catch(ParseException e){
            e.printStackTrace();
        }

        return badRequest();

    }

}
