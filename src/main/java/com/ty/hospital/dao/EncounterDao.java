package com.ty.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dto.Encounter;

public class EncounterDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createEncounter(Encounter encounter) {
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
	}

	public Encounter getEncounterById(int id) {
		return entityManager.find(Encounter.class, id);
	}

}
