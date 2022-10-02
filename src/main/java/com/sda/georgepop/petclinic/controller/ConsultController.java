package com.sda.georgepop.petclinic.controller;

import com.sda.georgepop.petclinic.service.ConsultService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.Scanner;

public class ConsultController {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    private final Scanner scanner = new Scanner(System.in);
    private final ConsultService consultService;

    public ConsultController(ConsultService consultService){
        this.consultService = consultService;
    }

    public void createConsult(){
        try {
            System.out.println("Please insert vet id");
            int vetId = Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert pet id");
            int petId = Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert the date of consult in this format : MM-dd-yyyy:");
            Date date = Date.valueOf(LocalDate.parse(scanner.nextLine(), FORMATTER));
            System.out.println("Please insert the descrition of consult");
            String description = scanner.nextLine();

            consultService.createConsult(vetId, petId, date, description);
        }catch(IllegalArgumentException| DateTimeException e){
            System.err.println("Invalid data" + e.getMessage());
        }catch (Exception e){
            System.err.println("Internal server error" + e.getMessage());
        }
    }
}
