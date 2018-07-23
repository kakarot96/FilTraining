package com.fil;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTesting {
	private String input, output;

	public ParameterizedTesting(String input, String output) {
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> data() {
		return Arrays.asList(new String[][] { { "adcb", "abcd" }, { "amnb", "abmn" }, { "kunal", "aklun" } });
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SortingClass sort = new SortingClass();
		String str = input;
		String result = sort.sortString(str);
		System.out.println(input + ":" + result);
		assert (result.equals(output));

	}

}
