package com.example.springapi.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="emergency_number")
public class EmergencyNumber  {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name="telp_pegawai")
    private String telpPegawai;

    @Column(name="telp_keamanan")
    private String telpKeamanan;

    @Column(name="telp_bidan")
    private String telpBidan;

    @Column(name="telp_tetua")
    private String telpTetua;

    @Column(name="telp_kader")
    private String telpKader;


    public EmergencyNumber(UUID id, String telpPegawai, String telpKeamanan, String telpBidan, String telpTetua, String telpKader) {
        this.id = id;
        this.telpPegawai = telpPegawai;
        this.telpKeamanan = telpKeamanan;
        this.telpBidan = telpBidan;
        this.telpTetua = telpTetua;
        this.telpKader = telpKader;
    }

    public EmergencyNumber() {

    }


    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id=id ;
    }

    public String getTelpPegawai () {
        return this.telpPegawai;
    }

    public void setTelpPegawai (String telpPegawai) {
        this.telpPegawai =telpPegawai ;
    }

    public String getTelpKeamanan () {
        return this.telpKeamanan;
    }

    public void setTelpKeamanan (String telpKeamanan) {
        this.telpKeamanan =telpKeamanan ;
    }

    public String getTelpBidan () {
        return this.telpBidan;
    }

    public void setTelpBidan (String telpBidan) {
        this.telpBidan =telpBidan ;
    }

    public String getTelpTetua () {
        return this.telpTetua;
    }

    public void setTelpTetua (String telpTetua) {
        this.telpTetua =telpTetua ;
    }

    public String getTelpKader () {
        return this.telpKader;
    }

    public void setTelpKader (String telpKader) {
        this.telpKader =telpKader ;
    }
}
