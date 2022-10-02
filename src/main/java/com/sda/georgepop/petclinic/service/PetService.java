package com.sda.georgepop.petclinic.service;

import java.io.IOException;
import java.sql.Date;

public interface PetService {

    void createPet(
            String race,
            Date birthday,
            boolean isVaccinated,
            String ownerName
    );

    void importPets() throws IOException;

}
