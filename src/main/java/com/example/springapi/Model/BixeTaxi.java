package com.example.springapi.Model;

import com.example.springapi.Enum.ActiveType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="bixe_taxi")
public class BixeTaxi {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name="name")
    private String Name;
    @Column(name="no_tlp")
    private String noTelp;

    @Column(name="image_url")
    private String imageUrl;



    @Column(name="is_active")
    private ActiveType isActive;

    @ManyToOne
    @JoinColumn(name = "village_id", nullable = true, columnDefinition = "INT(11) UNSIGNED")
    private Village village;

    public BixeTaxi() {

    }

    public BixeTaxi(UUID id, String name, String noTelp, String imageUrl, ActiveType isActive) {
        this.id = id;
        Name = name;
        this.noTelp = noTelp;
        this.imageUrl = imageUrl;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ActiveType getIsActive() {
        return isActive;
    }

    public void setIsActive(ActiveType isActive) {
        this.isActive = isActive;
    }
}
