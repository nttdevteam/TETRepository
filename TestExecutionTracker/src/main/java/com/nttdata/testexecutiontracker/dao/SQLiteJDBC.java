package com.nttdata.testexecutiontracker.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nttdata.testexecutiontracker.entity.ExcelSheetData;

public class SQLiteJDBC {
	public void connect(){
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\133661\\Desktop\\test.db");
	    } catch ( Exception e ) {
	    	e.printStackTrace();
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	}
	
	public void createTables()
	{
	    Connection c = null;
	    Statement stmt = null;
	    
		try {
			Class.forName("org.sqlite.JDBC");
		    c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\133661\\Desktop\\test.db");
		    System.out.println("Opened database successfully");
		    stmt = c.createStatement();
		    
		    
		    //1. Create AUTHENTICATION Table
		    String sql = "CREATE TABLE AUTHENTICATION " +
		                   "(ID INT PRIMARY KEY     NOT NULL," +
		                   " NAME           TEXT    NOT NULL, " + 
		                   " PASSWORD            TEXT     NOT NULL)"; 
		    stmt.executeUpdate(sql);


		    //2. Create PERMISSION Table
		    sql = "CREATE TABLE PERMISSION " +
	                   "(PERMISSION_ID INT NOT NULL," +
	                   " PERMISSION_NAME TEXT)"; 
		    stmt.executeUpdate(sql);

		    //3. Create AUTHORISATION Table
		    sql = "CREATE TABLE AUTHORISATION " +
	                   "(USER_ID INT NOT NULL," +
	                   " PERMISSION_ID INT)"; 
		    stmt.executeUpdate(sql);

		    
		    //4. Create EXCELSHEET Table
		    sql = "CREATE TABLE EXCELSHEET "
		    		+ "(id INT NOT NULL,"
		    		+ "projectName TEXT NOT NULL,"
		    		+ "cycleName TEXT NOT NULL,"
		    		+ "fsdName TEXT NOT NULL,"
		    		+ "functionality TEXT NOT NULL,"
		    		+ "testCaseNumber	TEXT,"
		    		+ "browser	TEXT,"
		    		+ "level1TestStatus	TEXT,"
		    		+ "level1User	TEXT,"
		    		+ "level1Date	TEXT,"
		    		+ "almDefect	TEXT,"
		    		+ "testEvidenceUploaded	TEXT,"
		    		+ "level2BVStatus	TEXT,"
		    		+ "level2User	TEXT,"
		    		+ "level2Date	TEXT,"
		    		+ "remarksId	INT);"; 
		    stmt.executeUpdate(sql);

		    //5. Create COMMENTS Table
		    sql = "CREATE TABLE COMMENT"
		    		+ "(comment_Id INT,"
		    		+ "excelsheet_Id INT,"
		    		+ "comment_User TEXT,"
		    		+ "comment_Date TEXT,"
		    		+ "comment TEXT);"; 
		    stmt.executeUpdate(sql);
		    
		    //6. Create HISTORY Table
		    sql = "CREATE TABLE HISTORY"
		    		+ "(HISTORY_Id INT,"
		    		+ "EXCELSHEET_ID TEXT,"
		    		+ "UPDATE_DATE TEXT,"
		    		+ "UPDATE_USER TEXT,"
		    		+ "HISTORY_DATA TEXT);"; 
		    stmt.executeUpdate(sql);
		    
		    sql = "CREATE TABLE PROJECT"
		    		+ "(ID INT NOT NULL,"
		    		+ "PROJECT_NAME TEXT,"
		    		+ "CYCLE_NAME_LIST TEXT)";
		    stmt.executeUpdate(sql);

		    
		    stmt.close();
		    c.close();
		} catch ( Exception e ) {
			e.printStackTrace();
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
	
	public void insertData()
	{
		Connection c = null;
	    Statement stmt = null;
	    try {} catch ( Exception e ) {
	    	e.printStackTrace();
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	}
	
	public static void main(String args[])
	{
		SQLiteJDBC sQLiteJDBC = new SQLiteJDBC();
		sQLiteJDBC.createTables();
		sQLiteJDBC.insertData();
	}
	
	
}