package com.king.bms.services;

import com.king.bms.entity.Language;

import java.util.List;

public interface LanguageService {

    /**
     * to add a languaged details in the system
     */

    public Language acceptLanguageDeatails(Language language);

    /**
     * to delete any language details
     */

    public Boolean deleteLanguageDetails(int languageId);

    /**
     * to get all language available
     */

    public List<Language> getAllLanguageAvailabe();
}
