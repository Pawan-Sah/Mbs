package com.king.bms.entity;

import jakarta.persistence.*;


@Entity

public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeId;

    @Column(length = 20,unique = true)
    private String userType="Customer";

    public UserType() {
    }

    public UserType(int userTypeId, String userType) {
        this.userTypeId = userTypeId;
        this.userType = userType;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "userTypeId=" + userTypeId +
                ", userType='" + userType + '\'' +
                '}';
    }
}
