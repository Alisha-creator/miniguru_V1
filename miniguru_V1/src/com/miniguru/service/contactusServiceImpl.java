package com.miniguru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniguru.dao.contactusDAO;
import com.miniguru.entity.contactus;

@Service
public class contactusServiceImpl implements contactusService {

    @Autowired
    private contactusDAO contactusDAO;
    
    @Override
    @Transactional
    public void savecontactus(contactus contactus) {
    	contactusDAO.savecontactus(contactus);
    }

}