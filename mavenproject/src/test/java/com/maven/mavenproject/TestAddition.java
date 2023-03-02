package com.maven.mavenproject;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TestAddition {

	public static int add(int a,int b)
	{
	int add=a+b;
	return add;
	}
		@Test
		public void addtest()
	{
			assertEquals(4,TestAddition.add(2, 2), 0);
			assertEquals(8,TestAddition.add(4, 4), 0);

	}
	public static int sub(int a,int b)
	{
		int sub=a-b;
		return sub;
		
	}
	@Test
	public void subtest()
	{
		assertEquals(1,TestAddition.sub(3, 2), 0);

	}
	public static int div(int a,int b)
	{
		int div=a/b;
		return div;
		
	}
	@Test
	public void divtest()
	{
		assertEquals(1,TestAddition.div(3, 2), 0);

	}
	public static int mod(int a,int b)
	{
		int mod=a/b;
		return mod;	
	}
	@Test
	public void modtest()
	{
		assertEquals(1,TestAddition.mod(3, 2), 0);

	}
	
	
}

