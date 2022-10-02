package com.sda.georgepop.petclinic;

import com.sda.georgepop.petclinic.controller.PetController;
import com.sda.georgepop.petclinic.controller.VetController;
import com.sda.georgepop.petclinic.repository.PetRepositoryImpl;
import com.sda.georgepop.petclinic.repository.VetRepositoryImpl;
import com.sda.georgepop.petclinic.service.PetServiceImpl;
import com.sda.georgepop.petclinic.service.VetServiceImpl;
import com.sda.georgepop.petclinic.utils.SessionManager;
import com.sda.georgepop.petclinic.utils.UserOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        PetController petController = new PetController(new PetServiceImpl(new PetRepositoryImpl()));
        UserOption userOption;

        Scanner scanner = new Scanner(System.in);

        do {
            try{
                UserOption.displayAllOptions();
                System.out.println("Please select an option:");
                int numericOption = Integer.parseInt(scanner.nextLine().trim());
                userOption = UserOption.findByNumericOption(numericOption);
            }catch(NumberFormatException e){
                userOption = UserOption.UNKNOWN;
            }
            switch (userOption) {
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VET:
                    vetController.showAllVets();
                    break;
                case VIEW_VET_BY_ID:
                    vetController.showVetById();
                    break;
                case UPDATE_VET_BY_ID:
                    vetController.updateVetById();
                    break;
                case DELETE_VET_BY_ID:
                    vetController.deleteVetById();
                    break;
                case ADD_PET:
                    petController.createPet();
                    break;
                case UNKNOWN:
                    System.err.println("Invalid option selected");
                    break;
                case EXIT:
                    System.out.println("Good Bye");
                    break;
            }

        } while (userOption != UserOption.EXIT);
        SessionManager.shutDown();
    }
}