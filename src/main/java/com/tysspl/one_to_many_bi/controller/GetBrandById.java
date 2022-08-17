package com.tysspl.one_to_many_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_bi.dto.Brand;
import com.tysspl.one_to_many_bi.dto.Product;

public class GetBrandById {

	public static void main(String[] args) {

		List<Product> lp = new ArrayList<Product>();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product1 = new Product();
		product1.setProductName("");
		product1.setProductType("Purifier");

		Product product2 = new Product();
		product2.setProductName("TVset");
		product2.setProductType("Television");

		Brand brand = entityManager.find(Brand.class, 1);
		if (brand != null) {
			System.out.println(brand);
			product1.setBrand(brand);
			product2.setBrand(brand);

			lp.add(product1);
			lp.add(product2);
			brand.setProducts(lp);
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(product1);
			entityManager.persist(product2);
			entityManager.persist(brand);
			entityTransaction.commit();
		} else {
			System.out.println("No data found");
		}

	}

}
