package Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Test1 {
public static void main(String[]args) throws ClassNotFoundException, SQLException, InterruptedException 
{   
	DB_Test1 obj = new DB_Test1();
	   obj.m11();
	   }

	
public void m11() throws ClassNotFoundException, SQLException, InterruptedException 
{
	 String dbURL = "jdbc:sqlserver://localhost:1433; databaseName=del;";   
	   String username = "sa";
	          String password = "123456";           
	          //Load MS SQL JDBC Driver
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	          //Creating connection to the database
	          Connection con = DriverManager.getConnection(dbURL,username,password);
	          Thread.sleep(3000);
	          //Creating statement object
	      	Statement st = con.createStatement();
	      	String selectquery = "SELECT * FROM del_tbl" ;
	          //Executing the SQL Query and store the results in ResultSet
	      	ResultSet rs = st.executeQuery(selectquery);
	      	//While loop to iterate through all data and print results
	      	while (rs.next()) {
	      		int EMPId = rs.getInt("id");   // id , name , city are column names 
	      		String Ename =rs.getString("name");  
	      		String Ecity =rs.getString("city");
	    //   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	       System.out.println(EMPId +"\t"+Ename+"\t"+Ecity);
	      	}
	          //Closing DB Connection
	      	con.close();
	
}

}


