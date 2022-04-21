package com.test;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("browser configuration and launch");

	}
	@AfterClass
	public static void afterclass() {
		System.out.println("close browser");
	}
	@Before
	public void beforeeachmethod() {
		Date d = new Date();
		System.out.println("Start time:"+  d);


	}	
	@After
	public void aftereachmethod() {
		Date d = new Date();
		System.out.println("End time:"+  d);
	}	
	@Test
	public void testcase1() {
		System.out.println("testcase 1");
	}
	@Test
	public void testcase3() {
		System.out.println("testcase 3");
	}

	@Test
	public void testcase2() {
		System.out.println("testcase 2");
	}





}

