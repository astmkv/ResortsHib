package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class DBResortControl implements ResOperation {


    @Override
    public void createRes(ResTableEntity res) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            // выполнение самой операции создания записи в БД
            transaction.begin();
            entityManager.persist(res);   // создание новой записи на основе объекта
            transaction.commit();
        } finally {
            // все закрыть и откатить транзакцию, если нужно
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public ResTableEntity getResByName(String param) {
        return null;
    }

//    @Override
//    public ResTableEntity getResByParam(String param, String value) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        ResTableEntity result = null;
//        try {
//            transaction.begin();
//
//            result = entityManager.find(ResTableEntity.class, param);
//            transaction.commit();
//        } finally {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            entityManager.close();
//            entityManagerFactory.close();
//        }
//        return result;
//    }

    /**
     * @return
     */
    @Override
    public List<ResTableEntity> getAllResorts() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        List<ResTableEntity> res = null;

        try {
            transaction.begin();
            // сама операция
            res = entityManager.createQuery("SELECT e FROM ResTableEntity e").getResultList();
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
        return res;

    }

    @Override
    public void updateRes(ResTableEntity res) {

    }

    @Override
    public boolean deleteResById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
//        boolean result = false;
        try {
            transaction.begin();
            // сама операция
            // 1. получить удаляемый объект
            ResTableEntity deleted = entityManager.find(ResTableEntity.class, id);
            // 2. удалить
            entityManager.remove(deleted);
            transaction.commit();
            return true;
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}