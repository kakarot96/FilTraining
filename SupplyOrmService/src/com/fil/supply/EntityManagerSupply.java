package com.fil.supply;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSupply {

	
	static EntityManagerFactory factory=null;
	static EntityManager em=null;
	
	
	private EntityManagerSupply(){
		
		factory=Persistence.createEntityManagerFactory("SupplyOrmService");
		em=factory.createEntityManager();
		System.out.println("in entity manager supply");
		
	}
	public static EntityManager getEntityManager(){
		try{
			if(em==null){
				new EntityManagerSupply();
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return em;
	}
	
}
