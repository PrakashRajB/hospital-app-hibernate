package com.ty.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dto.MedOrder;

public class MedOrderDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createMedOrder(MedOrder medOrder) {
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
	}

	public MedOrder getMedOrderById(int id) {
		return entityManager.find(MedOrder.class, id);
	}

}
