package com.king.bms.dao;

import com.king.bms.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking,Integer> {
}
