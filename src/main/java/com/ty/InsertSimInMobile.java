package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertSimInMobile {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setName("samsung");
		mobile.setPrice(500.00);
		
		Sim sim1=new Sim();
		sim1.setName("jio sim");
		sim1.setProvider("jio");
		sim1.setMobile(mobile);
		
		Sim sim2=new Sim();
		sim2.setName("airtel sim");
		sim2.setProvider("airtel");
		sim2.setMobile(mobile);
		
		Sim sim3=new Sim();
		sim3.setName("bsnl sim");
		sim3.setProvider("bsnl");
		sim3.setMobile(mobile);
		
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		sims.add(sim3);
		
		mobile.setSims(sims);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityTransaction.commit();
		
		
	}

}
