package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Pet;
import com.sda.georgepop.petclinic.model.Vet;

import java.sql.Date;

public class PetRepositoryImpl extends BaseRepositoryImpl<Pet> implements PetRepository{

    public PetRepositoryImpl() {
        super(Pet.class);
    }

    @Override
    public void createPet(String race, Date birthday, boolean isVaccinated, String ownerName) {
        Pet pet = new Pet();
        pet.setRace(race);
        pet.setDate(birthday);
        pet.setVaccinated(isVaccinated);
        pet.setOwnerName(ownerName);
        create(pet);
    }

    @Override
    public void updatePet(int id, String race, Date birthday, boolean isVaccinated, String ownerName) {
        Pet pet = new Pet();
        pet.setId(id);
        pet.setRace(race);
        pet.setDate(birthday);
        pet.setVaccinated(isVaccinated);
        pet.setOwnerName(ownerName);
        updateById(id, pet);
    }
}
