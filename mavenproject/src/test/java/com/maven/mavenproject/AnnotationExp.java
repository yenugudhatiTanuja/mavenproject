package com.maven.mavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationExp {
	static int beforeClassCount = 1;
	static int afterClassCount = 1;
	static int beforeCount = 1;
	static int afterCount = 1;
	@Before
	public void beforA()
	{
		System.out.println("execution method before count :" + beforeCount++);
	}
    @BeforeClass
    public static void beforeClassA()
    {
    	System.out.println("execution coubt before class method:" + beforeClassCount++);
    }
    @Test(timeout=100)
    public void Test1()
    {
    	System.out.println("\tcode for timeout");

    }
    @Test
    public void Test2()
    {
    	System.out.println("\tcode for test2");

    }
    @Test
    public void Test3()
    {
    	System.out.println("\tcode for test3");

    }
    @After
    public void afterA()
    {
    	System.out.println("execution method after method " + afterCount++);

    }
    @AfterClass
    public static void aferClassA()
    {
    	System.out.println("execution count after class " + afterClassCount++);

    }
	

}
