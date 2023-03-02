package com.example.springapi.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String villageName;
    private String villageVision;
    private String villageMission;
    private int villagePopulation;
    private int villageIncome;
    private String villageMapImage;
    @ManyToOne
    @JoinColumn(name = "emergency_number_id", nullable = true)
    private EmergencyNumber emergencyNumber;

    //Getters & Setters

    public Village() {

    }
    public Village(UUID id, String villageName, String villageVision, String villageMission, int villagePopulation, int villageIncome, String villageMapImage, EmergencyNumber emergencyNumber) {
        this.id = id;
        this.villageName = villageName;
        this.villageVision = villageVision;
        this.villageMission = villageMission;
        this.villagePopulation = villagePopulation;
        this.villageIncome = villageIncome;
        this.villageMapImage = villageMapImage;
        this.emergencyNumber = emergencyNumber;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getVillageVision() {
        return villageVision;
    }

    public void setVillageVision(String villageVision) {
        this.villageVision = villageVision;
    }

    public String getVillageMission() {
        return villageMission;
    }

    public void setVillageMission(String villageMission) {
        this.villageMission = villageMission;
    }

    public int getVillagePopulation() {
        return villagePopulation;
    }

    public void setVillagePopulation(int villagePopulation) {
        this.villagePopulation = villagePopulation;
    }

    public int getVillageIncome() {
        return villageIncome;
    }

    public void setVillageIncome(int villageIncome) {
        this.villageIncome = villageIncome;
    }

    public String getVillageMapImage() {
        return villageMapImage;
    }

    public void setVillageMapImage(String villageMapImage) {
        this.villageMapImage = villageMapImage;
    }

    public EmergencyNumber getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(EmergencyNumber emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }
}

