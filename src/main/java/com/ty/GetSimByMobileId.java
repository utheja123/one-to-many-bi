package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetSimByMobileId {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Mobile mobile=entityManager.find(Mobile.class, 1);
		if(mobile!=null)
		{
			System.out.println("mobile id:"+mobile.getId());
			System.out.println("mobile name:"+mobile.getName());
			System.out.println("mobile cost:"+mobile.getPrice());
			 
			List<Sim> sims=mobile.getSims();
			if(sims!=null)
			{
				for (Sim sim : sims) {
					System.out.println("sim id:"+sim.getId());
					System.out.println("sim name:"+sim.getName());
					System.out.println("sim provider:"+sim.getProvider());
				
					
				}
			}
			
		
		}
		
		
	}

}
