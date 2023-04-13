package com.king.bms.dao;

import com.king.bms.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users,Integer> {
    //
    // public Users FindUserByUsersName(String name);
}
