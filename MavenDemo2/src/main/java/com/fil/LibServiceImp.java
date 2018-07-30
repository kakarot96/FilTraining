package com.fil;

import org.springframework.stereotype.Service;

@Service
public class LibServiceImp implements LibService{

	@Override
	public String getBooks() {
		// TODO Auto-generated method stub
		
		System.out.println("called getbooks()");
		return "book";
	}

	@Override
	public String getStudent() {
		// TODO Auto-generated method stub
		System.out.println("called getstudent()");
		
		return "Student";
	}

	@Override
	public String getIssue(String bookName,String studentName) {
		// TODO Auto-generated method stub
		System.out.println("called getIssue()");
		System.out.println(bookName+" issue to "+ studentName);
		return "Issue";
	}

	
	
	
}
