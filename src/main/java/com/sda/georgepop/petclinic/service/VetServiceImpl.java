package com.sda.georgepop.petclinic.service;

import com.sda.georgepop.petclinic.model.Vet;
import com.sda.georgepop.petclinic.repository.VetRepository;

import java.util.List;
import java.util.Optional;

public class VetServiceImpl implements VetService {

    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void createVet(String firstname, String lastname, String address, String speciality) {
        if (firstname == null || firstname.isBlank()) {
            throw new IllegalArgumentException("First Name is INVALID");
        }
        if (lastname == null || lastname.isBlank()) {
            throw new IllegalArgumentException("Last Name is INVALID");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is INVALID");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is INVALID");
        }
        vetRepository.createVet(firstname, lastname, address, speciality);
    }

    @Override
    public List<Vet> getAllVets() {
        return vetRepository.getAllVets();
    }

    @Override
    public Optional<Vet> findById(int id) {
        return vetRepository.findById(id);
    }

    @Override
    public void updateVetById(int id, String firstname, String lastname, String address, String speciality) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id is INVALID");
        }
        if (firstname == null || firstname.isBlank()) {
            throw new IllegalArgumentException("First Name is INVALID");
        }
        if (lastname == null || lastname.isBlank()) {
            throw new IllegalArgumentException("Last Name is INVALID");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is INVALID");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is INVALID");
        }
        vetRepository.updateVetById(id, firstname, lastname, address, speciality);
    }

    @Override
    public void deleteVetById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id is INVALID");
        }
        vetRepository.deleteVetById(id);
    }
}
