package com.king.bms.dao;

import com.king.bms.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeDao extends JpaRepository<UserType,Integer> {
}
