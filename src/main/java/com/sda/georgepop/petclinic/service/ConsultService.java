package com.sda.georgepop.petclinic.service;


import java.sql.Date;

public interface ConsultService {

    void createConsult(int vetId, int petId, Date date, String description);
}
