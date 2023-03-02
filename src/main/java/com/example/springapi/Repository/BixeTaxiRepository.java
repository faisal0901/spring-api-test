package com.example.springapi.Repository;

import com.example.springapi.Model.EmergencyNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BixeTaxiRepository extends JpaRepository<EmergencyNumber, UUID> {
}
