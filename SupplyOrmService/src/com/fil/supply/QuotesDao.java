package com.fil.supply;

import java.util.List;

public interface QuotesDao {

	public Quote getQuote(int id);
	public List<Quote> getAllQuotes();
	public void addQuote(Quote quote);
	public void deleteQuote(Quote quote);
	public List<Quote> getSortedQuotes(Requirement req);
	
	
}
