package com.king.bms.dao;

import com.king.bms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status,Integer> {
}
