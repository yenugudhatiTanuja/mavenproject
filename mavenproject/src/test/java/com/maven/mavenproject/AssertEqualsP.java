package com.maven.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssertEqualsP {
	public static boolean checkString(String s)
	{
		String s1="Tanuja";
		//if(s1.equals(s))
		if(s1.contains(s))
		{
		    return true;
		}
		else
		{
			return false;
		}
		
	}
	@Test
	public void testCheckStr()
	{
	
		assertEquals(true,checkString("Tanuja123"));
	}
}
