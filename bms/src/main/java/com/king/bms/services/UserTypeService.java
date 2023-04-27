package com.king.bms.services;

import com.king.bms.entity.UserType;

import java.util.List;

public interface UserTypeService {

    public UserType acceptUserDetails(UserType userType);

    public List<UserType> getAllUserType();

    public Boolean deleteUserType(int userTypeId);
}
