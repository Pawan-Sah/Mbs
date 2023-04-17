package com.king.bms.services;

import com.king.bms.entity.Status;
import com.king.bms.exceptions.StatusDetailsNotFoundException;

import java.util.List;

public interface StatusService {
    // Add a new Status to the system
    public Status acceptStatusDetals(Status status);

    // Fetch the status based on id
    public Status getStatusBasedOnId(int id) throws StatusDetailsNotFoundException;

    //list out all the status
    public List<Status> getAllStatus();

    //Delete a status

    public Boolean deleteStatus(int id);


}
