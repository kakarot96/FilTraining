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
}


