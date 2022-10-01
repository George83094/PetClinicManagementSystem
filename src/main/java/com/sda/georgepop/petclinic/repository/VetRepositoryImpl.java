package com.sda.georgepop.petclinic.repository;

import com.sda.georgepop.petclinic.model.Vet;
import com.sda.georgepop.petclinic.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl implements VetRepository {


    @Override
    public void createVet(String firstname, String lastname, String address, String speciality) {
        Transaction transaction = null;
        try (Session session = SessionManager.getSessionFactory().openSession();) {
            transaction = session.beginTransaction();
            Vet vet = new Vet();
            vet.setFirstName(firstname);
            vet.setLastName(lastname);
            vet.setAddress(address);
            vet.setSpeciality(speciality);
            session.save(vet);
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public List<Vet> getAllVets() {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            List<Vet> allVets = session.createQuery("FROM Vet", Vet.class).getResultList();
            return allVets;
        }
    }

    @Override
    public Optional<Vet> findById(int id) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            Vet vet = session.find(Vet.class, id);
            return Optional.ofNullable(vet);
        }
    }

    @Override
    public void updateVetById(int id, String firstname, String lastname, String address, String speciality) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            Vet vet = session.find(Vet.class, id);
            if (vet != null) {
                Transaction transaction = session.beginTransaction();
                try {
                    vet.setFirstName(firstname);
                    vet.setLastName(lastname);
                    vet.setAddress(address);
                    vet.setSpeciality(speciality);
                }catch (Exception e){
                    transaction.rollback();
                    throw new IllegalStateException(e);
                }
                session.saveOrUpdate(vet);
                transaction.commit();
            } else {
                throw new IllegalArgumentException("Vet id not found in data");
            }
        }
    }
}
