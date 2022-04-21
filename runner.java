package com.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class runner {
	public static void main(String[] args) {
		
		
		Result r = JUnitCore.runClasses(JUnitCore.class,Search.class);
		int runCount = r.getRunCount();
		System.out.println("RunCount: "+ runCount);
		long runTime = r.getRunTime();
		System.out.println("runtime:"+  runTime);
		int failureCount = r.getFailureCount();
		System.out.println("Failurcount:"+ failureCount);
		int ignorecount = r.getIgnoreCount();
		System.out.println("Ignorecount:"+ ignorecount);
		List<Failure> failures = r.getFailures();		
		System.out.println("failures:"+ failures);
	
	}

}
