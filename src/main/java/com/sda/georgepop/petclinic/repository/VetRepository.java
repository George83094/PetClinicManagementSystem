package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Vet;

import java.util.List;

public interface VetRepository {
    void createVet (
            String firstname,
            String lastname,
            String address,
            String speciality
    );

    List<Vet> getAllVets();
}
