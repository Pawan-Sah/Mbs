package com.king.bms.dao;

import com.king.bms.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language,Integer> {
}
