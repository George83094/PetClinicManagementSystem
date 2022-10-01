package com.sda.georgepop.petclinic;

import com.sda.georgepop.petclinic.controller.VetController;
import com.sda.georgepop.petclinic.repository.VetRepositoryImpl;
import com.sda.georgepop.petclinic.service.VetServiceImpl;
import com.sda.georgepop.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        vetController.createVet();
    }
}