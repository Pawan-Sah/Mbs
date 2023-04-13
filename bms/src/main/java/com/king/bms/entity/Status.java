package com.king.bms.entity;

import jakarta.persistence.*;

@Entity

public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int statusId;

    @Column(length = 20, nullable = false, unique = true)
    private boolean status;


    public Status() {
    }

    public Status(int statusId, boolean status) {
        this.statusId = statusId;
        this.status = status;
    }
    @OneToOne(mappedBy = "status")
    private Booking booking;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", status=" + status +
                '}';
    }
}
