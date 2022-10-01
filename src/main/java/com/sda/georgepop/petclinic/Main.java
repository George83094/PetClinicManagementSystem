package com.sda.georgepop.petclinic;

import com.sda.georgepop.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        SessionManager.shutDown();
    }
}