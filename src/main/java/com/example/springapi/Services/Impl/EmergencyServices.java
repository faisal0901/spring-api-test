package com.example.springapi.Services.Impl;

import com.example.springapi.Model.EmergencyNumber;
import com.example.springapi.Repository.EmergencyNumberRepository;
import com.example.springapi.Services.IEmergencyNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyServices implements IEmergencyNumberService {
    @Autowired
    private EmergencyNumberRepository emergencyNumberRepository;

    @Override
    public EmergencyNumber saveEmergencyNumber(EmergencyNumber emergencyNumber) {

        return emergencyNumberRepository.save(emergencyNumber);

    }
}
