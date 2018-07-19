package com.fil.supply;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SupplierDaoImp implements SupplierDao{
	
	EntityManager em;
//	List<Object> list = new ArrayList<>();
	
	
	public SupplierDaoImp()
	{
		em=EntityManagerSupply.getEntityManager();
		System.out.println("connection estblish "+em);
		
	}

	@Override
	public Supplier getSupplier(int id) {
		Supplier s=em.find(Supplier.class, id);
		return s;
		
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Supplier");
		List<Supplier> list=query.getResultList();
		return list;
		
	}

	@Override
	public void deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(supplier);
		em.getTransaction().commit();
		
	}

	@Override
	public void addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(supplier);
		em.getTransaction().commit();
		
	}

 
	
	
	
	
	
	
}
