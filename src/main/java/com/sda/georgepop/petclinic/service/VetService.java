package com.sda.georgepop.petclinic.service;

import com.sda.georgepop.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetService {
    void createVet(
            String firstname,
            String lastname,
            String address,
            String speciality
    );
    List<Vet> getAllVets();

    Optional<Vet> findById(int id);
}
