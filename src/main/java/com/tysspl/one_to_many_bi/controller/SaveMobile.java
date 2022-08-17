package com.tysspl.one_to_many_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_bi.dto.Mobile;
import com.tysspl.one_to_many_bi.dto.SIM;

public class SaveMobile {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setName("Poco");
		mobile.setCost(18000);
		
		SIM sim1 = new SIM();
		sim1.setProvider("BSNL");
		sim1.setImrc("IMRC7978554B");
		sim1.setMobile(mobile);

		SIM sim2 = new SIM();
		sim2.setProvider("Idea");
		sim2.setImrc("IMRC1811187I");
		sim2.setMobile(mobile);
		
		entityTransaction .begin();
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(mobile);
		entityTransaction.commit();
		System.err.println("**********Saved*************");
	}

}
