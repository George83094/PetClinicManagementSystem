package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository {
    void createVet (
            String firstname,
            String lastname,
            String address,
            String speciality
    );

    List<Vet> getAllVets();

    Optional<Vet> findById(int id);

    void updateVetById (
            int id,
            String firstname,
            String lastname,
            String address,
            String speciality
    );
}
