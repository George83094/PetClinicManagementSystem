package com.sda.georgepop.petclinic.service;

import com.sda.georgepop.petclinic.model.Vet;

import java.io.IOException;
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

    void updateVetById (
            int id,
            String firstname,
            String lastname,
            String address,
            String speciality
    );

    void deleteVetById(int id);

    void importVets() throws IOException;
}
