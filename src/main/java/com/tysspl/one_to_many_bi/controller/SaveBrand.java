package com.tysspl.one_to_many_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_bi.dto.Brand;
import com.tysspl.one_to_many_bi.dto.Product;

public class SaveBrand {

	public static void main(String[] args) {
		Brand brand=new Brand();
		brand.setName(" ");
		brand.setHeadOffice("China");
		
		Product product1 = new Product();
		product1.setProductName("POCO X4");
		product1.setProductType("Mobile");
		product1.setBrand(brand);
		
		
		Product product2 = new Product();
		product2.setProductName("MRF");
		product2.setProductType("Cricket Bat");
		product2.setBrand(brand);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(brand);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityTransaction.commit();
		
	}

}
