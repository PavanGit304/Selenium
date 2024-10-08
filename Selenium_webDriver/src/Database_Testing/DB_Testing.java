package Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing {
	
	   public static void main(String[]args) throws ClassNotFoundException, SQLException, InterruptedException {
		   
		   DB_Testing obj = new DB_Testing();
		   obj.m1();
		  }

	   
	   
	  int EMPId ;
	  String Ename;
	  String Ecity;
	   
	   
	

//Script to get the data from the Database 

	public void m1() throws ClassNotFoundException, SQLException, InterruptedException 
	{
		 String dbURL = "jdbc:sqlserver://localhost:1433; databaseName=del;";    //jdbc:sqlserver://localhost/dbName c:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL
		          String username = "sa";
		          String password = "123456";            //jdbc:jtds:sqlserver://" + serverName1 + "/" + databaseName1
		          //Load MS SQL JDBC Driver
		         // Class.forName("net.sourceforge.jtds.jdbc.Driver");
		          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		          //Creating connection to the database
		          Connection con = DriverManager.getConnection(dbURL,username,password);
		          Thread.sleep(3000);
		          //Creating statement object
		      	Statement st = con.createStatement();
		      	String selectquery = "SELECT * FROM del_tbl ";
		          //Executing the SQL Query and store the results in ResultSet
		      	ResultSet rs = st.executeQuery(selectquery);
		      	//While loop to iterate through all data and print results
		      	while (rs.next()) {
		       //System.out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3));
		      		EMPId =rs.getInt("id");
		      		Ename = rs.getString("name");
		      		Ecity = rs.getString("city");
		      		System.out.println(EMPId+"\t"+Ename+"\t"+Ecity);
		      	}
		          //Closing DB Connection
		      	con.close();
		
	}
	








//Script to update the data in the Database
void m2() throws ClassNotFoundException, SQLException {
		 String dbURL = "jdbc:sqlserver://localhost:1433; databaseName=del;";
		 String username = "sa";
		        String password = "123456";
		        String updatequery = "upate del_tbl SET city = 'complex'  where id=303";                      //"UPDATE <table_name> SET <column_name> = <some_value>";
		        
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		   Connection con = DriverManager.getConnection(dbURL,username,password);
		    	Statement stmt = con.createStatement();
		    	stmt.executeUpdate(updatequery);  
		    	con.close();
	     }

//Script to delete the data in the Database

	void m3() throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:sqlserver://localhost:1433; databaseName=del;";
		 String username = "sa";
		        String password = "123456";
		        String query = "DELETE FROM <table_name>"; 
		        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		   Connection con = DriverManager.getConnection(dbURL,username,password);
		    	Statement stmt = con.createStatement(); 
		    	stmt.executeUpdate(query);
		    	//Closing DB Connection
		    	con.close();
		
	}
	
}