package com.king.bms.entity;

import jakarta.persistence.*;

@Entity

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int languageId;

    @Column(nullable = false,unique = true,length = 20)
    private String languageChoose;

    public Language() {
    }

    public Language(int languageId, String languageChoose) {
        this.languageId = languageId;
        this.languageChoose = languageChoose;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageChoose() {
        return languageChoose;
    }

    public void setLanguageChoose(String languageChoose) {
        this.languageChoose = languageChoose;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", languageChoose='" + languageChoose + '\'' +
                '}';
    }
}
