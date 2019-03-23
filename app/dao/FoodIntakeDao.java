package dao;

import models.FoodIntake;

import java.util.Collection;
import java.util.Date;


public interface FoodIntakeDao extends CrudDao<FoodIntake, Integer>{

    Collection<FoodIntake> createFoodIntake(Collection<FoodIntake> intakes);
    Collection<FoodIntake> getStats(Date startDate, Date endDate);


}