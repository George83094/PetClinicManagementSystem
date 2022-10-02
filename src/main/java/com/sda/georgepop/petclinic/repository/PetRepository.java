package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Pet;

import java.sql.Date;

public interface PetRepository extends BaseRepository<Pet> {

    void createPet(String race, Date birthday, boolean isVaccinated, String ownerName);

    void updatePet(int id, String race, Date birthday, boolean isVaccinated, String ownerName);
}
