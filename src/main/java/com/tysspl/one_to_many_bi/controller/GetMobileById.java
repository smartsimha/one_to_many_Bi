package com.tysspl.one_to_many_bi.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_bi.dto.Mobile;
import com.tysspl.one_to_many_bi.dto.SIM;

public class GetMobileById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Enter the sim id");
		SIM sim = entityManager.find(SIM.class, sc.nextInt());
		if (sim != null) {
			Mobile mobile = sim.getMobile();
			System.out.println(mobile.getName());
			System.out.println(mobile.getCost());
		} else {
			System.out.println("No data found");
		}
	}

}
