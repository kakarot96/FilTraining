package com.fil.supply;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RequirementDaoImp implements RequirementDao{
	EntityManager em;
	public RequirementDaoImp() {
		
		em=EntityManagerSupply.getEntityManager();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addRequirement(Requirement requirement) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(requirement);
		em.getTransaction().commit();
	}

	@Override
	public void deleteRequirement(Requirement requirement) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(requirement);
		em.getTransaction().commit();
	}

	@Override
	public List<Requirement> getAllRequirements() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Requirement");
		return query.getResultList();
	}

	@Override
	public Requirement getRequirement(int id) {
		// TODO Auto-generated method stub
return em.find(Requirement.class, id);

		}

	
	

}
