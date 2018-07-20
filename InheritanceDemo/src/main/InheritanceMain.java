package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fil.inheritance.RegularUser;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("InheritanceDemo");
		EntityManager em=factory.createEntityManager();
		RegularUser ru=new RegularUser(1, 100);
		em.getTransaction().begin();
		em.persist(ru);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
		
	}

}
