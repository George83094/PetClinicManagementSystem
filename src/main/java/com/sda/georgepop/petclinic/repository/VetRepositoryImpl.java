package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Vet;
import com.sda.georgepop.petclinic.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl extends BaseRepositoryImpl<Vet> implements VetRepository {

    public VetRepositoryImpl() {
        super(Vet.class);
    }


    @Override
    public void createVet(String firstname, String lastname, String address, String speciality) {
        Vet vet = new Vet();
        vet.setFirstName(firstname);
        vet.setLastName(lastname);
        vet.setAddress(address);
        vet.setSpeciality(speciality);
        create(vet);
    }


    @Override
    public void updateVetById(int id, String firstname, String lastname, String address, String speciality) {
        Vet vet = new Vet();
        vet.setId(id);
        vet.setFirstName(firstname);
        vet.setLastName(lastname);
        vet.setAddress(address);
        vet.setSpeciality(speciality);

        updateById(id, vet);

    }

}
