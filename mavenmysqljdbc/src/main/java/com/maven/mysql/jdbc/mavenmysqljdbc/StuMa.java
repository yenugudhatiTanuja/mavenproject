package com.maven.mysql.jdbc.mavenmysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.Student;

public class StuMa {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost/dbfirst", "root", "root");
        System.out.println("Database connection granted");
		int sid;
		String sname;
		String sdegree;
		String scity;
       while(true)
       {
    	   System.out.println("1.add details");
    	   System.out.println("2.display details");
    	   System.out.println("3.update details");
    	   System.out.println("4.remove details");
    	   System.out.println("5.Exit");
    	   System.out.println("Enter your choice::");
    	   Scanner s=new Scanner(System.in);
    	   int choice =s.nextInt();
    	   switch(choice)
    	   {
    	   case 1:
    		   Scanner s1=new Scanner(System.in);
    		   System.out.println("Enter sid ");
    		   sid=s1.nextInt();
    		   System.out.println("Enter sname ");
    		   sname=s1.next();
    		   System.out.println("Enter sdegree ");
    		   sdegree=s1.next();
    		   System.out.println("Enter scity");
    		   scity=s1.next();
    		   String sql="insert into student(sid,sname,sdegree,scity) values(?,?,?,?)";
    		   PreparedStatement prestmt=con.prepareStatement(sql);
    		   
    		   prestmt.setInt(1, sid);
    		   prestmt.setString(2,sname);
    		   prestmt.setString(3,sdegree);
    		   prestmt.setString(4,scity);
    		   prestmt.executeUpdate();
    		   System.out.println("Record added");
    		   prestmt.close();
    		   break;
    	   case 2:
    		   System.out.println("ALL Details");
    		    //PreparedStatement 
    		 //  String sql1="select * from student";
    		   PreparedStatement prestmt1=con.prepareStatement("select * from student");

    			ResultSet rs = prestmt1.executeQuery();
    			ArrayList<Student> alist = new ArrayList<Student>();
    			while(rs.next())
    			{
    				Student l = new Student();
    				l.setSid(rs.getInt("Sid"));
    				l.setSname(rs.getString("Sname"));
    				l.setSdegree(rs.getString("Sdegree"));
    				l.setScity(rs.getString("Scity"));
    				alist.add(l);
    			}
    			for(Student lt : alist)
    			{
    				System.out.println("sid : "+lt.getSid());
    				System.out.println("sname : "+lt.getSname());
    				System.out.println("degree: "+lt.getSdegree());
    				System.out.println("city: "+lt.getScity());

    			}
    			break;
    	   case 3:
    		   /*while(true)
    		   {
    			   System.out.println("1.record update name based on id ");
    			   System.out.println("2.record update degree based on id ");
    			   System.out.println("3.record update city based on id ");
    			   System.out.println("Enter your choice ");
    			   Scanner s3=new Scanner(System.in);
    			   int ch=s3.nextInt();
                   switch(ch)
                   {*/
                   
                  // case 1:
                	   	String sqlUpdate = "update student set sname = ? WHERE sid = ?";

                	   	PreparedStatement prestmt2 = con.prepareStatement(sqlUpdate);
                	   	Scanner s2=new Scanner(System.in);
                	   	System.out.println("Enter name");
                	   	String name=s2.next();
                	   	System.out.println("Enter id");
                	   	int id=s2.nextInt(); 
                	   	prestmt2.setString(1, name);
                	   	prestmt2.setInt(2, id);
                	   	int i= prestmt2.executeUpdate();
                	   	System.out.println(i+"Record is updated");
                	   	break;
                   //case 2:
    	   case 4:
    			String sqlDelete = "delete from student WHERE sid = ?";
    			PreparedStatement prestmt3 = con.prepareStatement(sqlDelete);
        	   	Scanner r=new Scanner(System.in);
        	   	System.out.println("Enter id");
        	   	int id1=r.nextInt();
        	   	prestmt3.setInt(1, id1);
        	   	prestmt3.executeUpdate();
        	   	System.out.println("deletion done");
    		   break;
    	   case 5:
    		   System.exit(0);
    		   break;

                   }   
    		   }
    	   }
       }


