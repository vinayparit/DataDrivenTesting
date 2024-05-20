package com.DataDrivenTesting.DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws SQLException {

		// Step 1:- Register DataBase
		Connection con=null; //Global variable
		Statement state=null; //Global variable
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		
		//Step 2:- Get connection for database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet54","root","root");
		
		//Step 3:- Create Statement
		state=con.createStatement();
		
		String query="insert into rmg values(3, 'Sachin','SQL', '1 week');";
		
		//Step 4:- Update Query
		
		int result= state.executeUpdate(query);
		
		if(result>=1)
		{
			System.out.println("Data is updated");
		}
		else
		{
			System.out.println("No data updated");
		}
		
		// to print all the data from table 
		
		String query1="select * from rmg;";
		ResultSet result1=state.executeQuery(query1);
		
		while(result1.next())
		{
			System.out.println(result1.getString(1)+" "+result1.getString(2)+" "+result1.getString(3)+" "+result1.getString(4));
		}
		
		// To delete row from a table
		String query2="delete from rmg where EmpID=4; ";
		
		int result2=state.executeUpdate(query2);
		
		if(result2>=1)
		{
			System.out.println("Database Updated");
		}
		else
		{
			System.out.println("Database not altered");
		}
		
		con.close();
	}
}
