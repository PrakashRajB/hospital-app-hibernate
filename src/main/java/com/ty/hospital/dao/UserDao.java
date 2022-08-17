package com.ty.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dto.User;
import com.ty.hospital.helper.AES;

public class UserDao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	public boolean validateUser(String email, String password) {

		String jqpl = "SELECT u FROM User u WHERE EMAIL=?1 AND PASSWORD =?2 ";

		Query query = entityManager.createQuery(jqpl);
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<User> users = query.getResultList();
		return users.isEmpty() ? false : true;
	}

}
