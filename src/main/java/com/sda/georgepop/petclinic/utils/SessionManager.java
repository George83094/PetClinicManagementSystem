package com.sda.georgepop.petclinic.utils;


import com.mysql.cj.xdevapi.SessionFactory;

import java.lang.module.Configuration;

public class SessionManager extends AbstractSessionManager{

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager(){

    }

    public static SessionFactory getSessionFactory(){
        return INSTANCE.getSessionFactory("pet_clinic");
    }

    public static void shutDown(){
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration){
        // configuration.addAnotatedClass(Vet.class);
    }

}
