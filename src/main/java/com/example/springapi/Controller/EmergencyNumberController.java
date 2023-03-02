package com.example.springapi.Controller;

import com.example.springapi.Model.EmergencyNumber;
import com.example.springapi.Services.IEmergencyNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmergencyNumberController {
    @Autowired
    private IEmergencyNumberService emergencyNumberService;
    @PostMapping("/emergency-number")
    public ResponseEntity<EmergencyNumber> createEmergencyNumber(@RequestBody EmergencyNumber emergencyNumber) {
        EmergencyNumber newEmergencyNumber = emergencyNumberService.saveEmergencyNumber(emergencyNumber);
        return new ResponseEntity<>(newEmergencyNumber, HttpStatus.CREATED);
    }
}
