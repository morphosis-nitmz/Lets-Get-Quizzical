package com.morphosis.quiz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class DatabaseConnection {

   static Connection con = null;
	public  static Statement getConnection() throws Exception
	{
         Statement statement=null;
	    // Database Info
         String url = "jdbc:mysql://localhost:3306/quiz";
     	String username="root";
     	String password = "7352026597yk";
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
		    con= DriverManager.getConnection(url,username,password);
		    

	    } catch(Exception e){
	    	System.out.println("Database Error" + "\n We will fix Wait for some time!!" + "\nsorry for the inconvenience");
	    }
	    
	    //connection = DriverManager.getConnection(db_url,db_user,db_password);
	    statement = con.createStatement();
	    
	    return statement;
	}
	public static void  getCloseConnection() throws Exception {
		
		con.close();
	}
	
}