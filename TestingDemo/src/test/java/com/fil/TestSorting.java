package com.fil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestSorting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test");
	}

	@Test(expected= AssertionError.class )
	public void test() {
		SortingClass sort=new SortingClass();
		String str= "abacbdfd";
		String result=sort.sortString(str);
		System.out.println(result);
		assert(str.equals("aabbcddf"));
		
		
	}
	@Test(expected=NullPointerException.class)
	public void test2() {
		SortingClass sort=new SortingClass();
		String str= "ababdfdc";
		String result=sort.sortString(str);
		System.out.println(result);
		assert(result.equals("aabbcddf"));
		
	}	
	
	@Test(timeout=1)
	public void test3() {
		SortingClass sort=new SortingClass();
		String str= "abacbdfd";
		String result=sort.sortString(str);
		for(int i=0;i<1000000;i++){
		str+="t";
		result=sort.sortString(str);
		System.out.println(result);
		assert(str.equals(str));
		
		}
	}
	
}


