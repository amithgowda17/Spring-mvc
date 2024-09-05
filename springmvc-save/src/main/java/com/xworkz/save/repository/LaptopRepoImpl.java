package com.xworkz.save.repository;

import com.xworkz.save.entity.LaptopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class LaptopRepoImpl implements LaptopRepo {


    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(LaptopEntity laptopEntity) {


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        try {
            entityManager.persist(laptopEntity);
            entityTransaction.commit();
        } catch (Exception e) {
            System.out.println("handling exception");
            return false;
        } finally {

            entityManager.close();

        }

        return true;
    }

    @Override
    public List<LaptopEntity> readAll() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("readAll");

            List<LaptopEntity> laptopEntities = query.getResultList();
            if (laptopEntities != null) {

                return laptopEntities;

            }
            entityTransaction.commit();
        } catch (Exception e) {

            return Collections.emptyList();
        }finally {
            entityManager.close();
            entityManagerFactory.close();

        }
        return Collections.emptyList();
    }


}



