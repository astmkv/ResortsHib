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
    public ResTableEntity getResById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
//         result = null;
        try {
            transaction.begin();
            ResTableEntity result = entityManager.find(ResTableEntity.class, id);
            transaction.commit();
            return result;
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }

    }

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
    public void updateRes(int id, List<String> newParams) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            // сама операция
            ResTableEntity result = entityManager.find(ResTableEntity.class, id);
            result.setName(newParams.get(0));
            result.setCountry(newParams.get(1));
            result.setSeason(newParams.get(2));
            result.setPrice(Long.valueOf(newParams.get(3)));

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }


    @Override
    public void deleteResById(int id) {
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
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}