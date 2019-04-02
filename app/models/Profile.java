package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Entity
public class Profile {

    public enum Gender {
        MALE,
        FEMALE,
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;


    @OneToOne
    public User user;


    @Basic
    @JsonProperty("dob")
    private Date dob;


//    @Basic
//    @JsonIgnore
//    private Integer age;

    @Basic
    @JsonProperty("height")
    private Integer height;

    @Basic
    @JsonProperty("weight")
    private Integer weight;


    @Basic
    public Gender gender;


    @Basic
    @JsonProperty("goalPlan")
    private Float goalPlan;


    public Profile() {
        //Important for json serialization
    }

    @Override
    public String toString() {
        return "User " + user + "height" + height + "weight" + weight;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    @JsonProperty("age")
    public Integer getAge() {


        LocalDate today = LocalDate.now();

        LocalDate birthDate= dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        final Integer age = Period.between(birthDate,today).getYears();

        return age;
    }



    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {

        this.height = height;
    }

    public Integer getWeight() {

        return weight;
    }

    public void setWeight(Integer weight) {

        this.weight = weight;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public Integer getId() {

        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public Float getGoalPlan() {

        return goalPlan;
    }

    public void setGoalPlan(Float goalPlan) {

        this.goalPlan = goalPlan;
    }


}