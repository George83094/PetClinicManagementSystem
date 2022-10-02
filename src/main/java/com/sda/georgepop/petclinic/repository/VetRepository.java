package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository extends BaseRepository<Vet> {
    void createVet (
            String firstname,
            String lastname,
            String address,
            String speciality
    );

    void updateVetById (
            int id,
            String firstname,
            String lastname,
            String address,
            String speciality
    );
}
