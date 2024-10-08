package Databaseanddriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseandDataDrivenClass 
{
	
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException
	{
		String dburl="   jdbc:sqlserver://c:\\Program Files\\Microsoft SQL Server\\MSSQL14.MSSQLSERVER\\MSSQL";
		String username="sa";
		String password="123456";
		String query="select * from ph_book;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    // it register driver class and it load the driver class
		Connection con=DriverManager.getConnection(dburl,username,password);  //it establish the connection to the DB    DriverManager it manages the JDBC drivers
		Statement stmt=con.createStatement();      //   it provide method to execute query into DB                           
		ResultSet rs=stmt.executeQuery(query);      //  executing the query                                              
		while(rs.next()) {                        //fetching the data from result set  
			
			System.out.println(rs.getString("Fname"));
		}
		rs.close();
		con.close();
	}
			
}