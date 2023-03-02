package com.example.springapi.Repository;

import com.example.springapi.Model.EmergencyNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmergencyNumberRepository extends JpaRepository<EmergencyNumber, UUID> {
    Optional<EmergencyNumber> findByTelpPegawai(String telpPegawai);

    // Find all
    List<EmergencyNumber> findAll();

    // Save
    <S extends EmergencyNumber> S save(S entity);

    // Delete by id
    void deleteById(UUID id);

    // Delete all
    void deleteAll();
}