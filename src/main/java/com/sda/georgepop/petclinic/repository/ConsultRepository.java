package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Consult;
import com.sda.georgepop.petclinic.model.Pet;
import com.sda.georgepop.petclinic.model.Vet;

import java.sql.Date;

public interface ConsultRepository extends BaseRepository<Consult> {

    void createConsult(Vet vet, Pet pet, Date date, String description);
}
