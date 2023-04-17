package com.king.bms.services.impl;

import com.king.bms.dao.StatusDao;
import com.king.bms.entity.Status;
import com.king.bms.exceptions.StatusDetailsNotFoundException;
import com.king.bms.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusDao statusDao;

    @Override
    public Status acceptStatusDetals(Status status) {
        return statusDao.save(status);
    }

    @Override
    public Status getStatusBasedOnId(int id) throws StatusDetailsNotFoundException {
        Status FindStatus=statusDao.findById(id).orElseThrow(()->new StatusDetailsNotFoundException("We can not find status by given status id :"+id));
       return FindStatus;

    }

    @Override
    public List<Status> getAllStatus() {
        return statusDao.findAll();
    }

    @Override
    public Boolean deleteStatus(int id) {
        statusDao.deleteById(id);
        return  true;
    }
}
