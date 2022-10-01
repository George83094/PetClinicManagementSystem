package com.sda.georgepop.petclinic;

import com.sda.georgepop.petclinic.controller.VetController;
import com.sda.georgepop.petclinic.repository.VetRepositoryImpl;
import com.sda.georgepop.petclinic.service.VetServiceImpl;
import com.sda.georgepop.petclinic.utils.SessionManager;
import com.sda.georgepop.petclinic.utils.UserOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        UserOption userOption;

        Scanner scanner = new Scanner(System.in);

        do {
            UserOption.displayAllOptions();
            System.out.println("Please select an option:");
            int numericOption = scanner.nextInt();
            userOption = UserOption.findByNumericOption(numericOption);
            switch (userOption) {
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VET:
                    vetController.showAllVets();
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