package com.sda.georgepop.petclinic.service;

public interface VetService {
    void createVet(
            String firstname,
            String lastname,
            String address,
            String speciality
    );
}
