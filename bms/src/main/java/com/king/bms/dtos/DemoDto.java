package com.king.bms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DemoDto {
    @JsonProperty("demo_id")
    private int demoId;

    @JsonProperty("demo_name")
    private String demoName;

    @JsonProperty("demo_desc")
    private String demoDescription;

    public int getDemoId() {
        return demoId;
    }

    public void setDemoId(int demoId) {
        this.demoId = demoId;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoDescription() {
        return demoDescription;
    }

    public DemoDto(int demoId, String demoName, String demoDescription) {
        this.demoId = demoId;
        this.demoName = demoName;
        this.demoDescription = demoDescription;
    }

    public DemoDto() {
    }

    @Override
    public String toString() {
        return "DemoDto{" +
                "demoId=" + demoId +
                ", demoName='" + demoName + '\'' +
                ", demoDescription='" + demoDescription + '\'' +
                '}';
    }

    public void setDemoDescription(String demoDescription) {
        this.demoDescription = demoDescription;
    }
}
