package com.fil.supply;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class QuotesDaoImp implements QuotesDao{
EntityManager em;
	
	public QuotesDaoImp(){
		em=EntityManagerSupply.getEntityManager();
		
	}
	
	
	
	@Override
	public Quote getQuote(int id) {
		// TODO Auto-generated method stub
		
		
		return em.find(Quote.class, id);
	}

	@Override
	public List<Quote> getAllQuotes() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Quote");
		return query.getResultList();
	}

	@Override
	public void addQuote(Quote quote) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(quote);
		em.getTransaction().commit();
		
		
	}

	@Override
	public void deleteQuote(Quote quote) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(quote);
		em.getTransaction().commit();
		
	}



	@Override
	public List<Quote> getSortedQuotes(Requirement req) {
		//Quote quote=new Quote();
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Quote quote where quote.requirement=:n order by price");
		query.setParameter("n", req);
		//query.setParameter(1, req.getRid());
	
		List<Quote> quotes=query.getResultList();
		
// 		for (Quote quote2 : quotes) {
//			System.out.println(quote2);
//		}
//		System.out.println("hi");
		return quotes;
	}

}
