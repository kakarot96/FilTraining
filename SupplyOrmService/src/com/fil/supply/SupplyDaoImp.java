package com.fil.supply;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class SupplyDaoImp implements SupplyDao{

	EntityManager em;
	public SupplyDaoImp(){
		
		em=EntityManagerSupply.getEntityManager();
		System.out.println("in supply const");
	}
	
	
	
	
	@Override
	public Supply getSupply(int id) {
		// TODO Auto-generated method stub
		return em.find(Supply.class, id);
	}

	@Override
	public List<Supply> getAllSupplies() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Supply");
		List<Supply> list=query.getResultList();
		return list;
	}

	@Override
	public void addSupply(Supply supply) {
		em.getTransaction().begin();
		em.persist(supply);
		em.getTransaction().commit();
	}

	@Override
	public void deleteSupply(int id) {
		// TODO Auto-generated method stub
		Supply sup=getSupply(id);
		em.getTransaction().begin();
		em.remove(sup);
		em.getTransaction().commit();
	}




	@Override
	public int getMaxQtySupplied(Supplier supplier, Part part) 
	{
		// TODO Auto-generated method stub
		Query query = em.createQuery("select max(supply.qty) from Supply supply group by supply.supplier having supply.supplier=:n and supply.part=:m");
		query.setParameter("n", supplier);
		query.setParameter("m", part);
		System.out.println("getmaxsupply   "+ query.getFirstResult());
		return query.getFirstResult();
		
		
	}

}
