package com.xworkz.crud.repository;

import com.xworkz.crud.entity.TraineeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;


@Repository
public class TraineeRepoImpl implements TraineeRepo {


    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveInRepo(TraineeEntity traineeEntity) {

        System.out.println("==========" + traineeEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(traineeEntity);
            entityTransaction.commit();
        } catch (Exception e) {
            return false;
        } finally {

            entityManager.close();

        }
        return true;
    }

    @Override
    public List<TraineeEntity> readAllFromRepo() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            Query query = entityManager.createNamedQuery("ReadAll");
            List<TraineeEntity> traineeEntities=query.getResultList();

            System.out.println(traineeEntities);
            return traineeEntities;
        } catch (Exception e) {
            return Collections.emptyList();

        } finally {
            entityManager.close();
        }

    }
}
