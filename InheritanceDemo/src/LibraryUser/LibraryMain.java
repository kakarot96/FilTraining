package LibraryUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("InheritanceDemo");
		EntityManager em=factory.createEntityManager();
		
		Faculty f1 = new Faculty(1,"kunal",1,"CSE");
		Faculty f2 = new Faculty(2,"mohit",1,"CSE");
		Student s1=new Student(4,"aa",1,"");
		em.getTransaction().begin();
	//m.persist(f1);
	//m.persist(f2);
		em.persist(s1);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
	}

}
