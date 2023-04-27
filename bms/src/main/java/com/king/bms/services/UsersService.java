package com.king.bms.services;

import com.king.bms.entity.Users;

import java.util.List;

public interface UsersService {

    public Users acceptUsersDetails(Users users);

    public Users getUser(int userId);

    public Users getUserByName(String userName);

    public Users getUsersByMobileNumber(Integer mobileNumber);

    public List<Users> getAllUsers();

    public Boolean deleteUserDetails(int userid);
}
