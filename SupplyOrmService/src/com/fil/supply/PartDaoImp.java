package com.fil.supply;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Table;



public class PartDaoImp implements PartDao{
EntityManager em;


	public PartDaoImp(){
		em=EntityManagerSupply.getEntityManager();
		System.out.println("connection estblish "+em);
	}
	
	
	
	@Override
	public List<Part> getAllParts() {
		// TODO Auto-generated method stub
		Query query= em.createQuery("from Part");
		
		List<Part> list=query.getResultList();
		return list;
	}

	@Override
	public Part getPart(int id) {
		// TODO Auto-generated method stub
		return em.find(Part.class, id);
	}

	@Override
	public void addPart(Part part) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(part);
		em.getTransaction().commit();
	}

	@Override
	public void deletePart(Part part) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(part);
		em.getTransaction().commit();
	}
	

}
