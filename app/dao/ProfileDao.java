package dao;

import models.Profile;

import java.util.Date;

public interface ProfileDao extends CrudDao<Profile, Integer>{

    Profile searchByUserName(String username);
    //Profile updateProfile();
    //Integer getAgeFromDob(Profile profile,Date date);

}