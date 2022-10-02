package com.sda.georgepop.petclinic.service;

import java.sql.Date;

public interface PetService {

    void createPet(
            String race,
            Date birthday,
            boolean isVaccinated,
            String ownerName
    );

}
