package com.maven.mavenproject;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMavenAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Result result=JUnitCore.runClasses(AnnotationExp.class);
        for(Failure failure:result.getFailures())
        {
        	System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());
	}

}
