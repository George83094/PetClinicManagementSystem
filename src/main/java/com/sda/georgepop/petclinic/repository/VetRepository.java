package com.sda.georgepop.petclinic.repository;

public interface VetRepository {
    void createVet (
            String firstname,
            String lastname,
            String address,
            String speciality
    );
}
