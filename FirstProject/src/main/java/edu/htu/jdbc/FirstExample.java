package edu.htu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {
//   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//   static final String DB_URL = "jdbc:mysql://localhost:3306/hr2";
//
//   //  Database credentials
//   static final String USER = "root";
//   static final String PASS = "123456";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	   Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr2", "root", "123456");
		if (connection != null) {
			System.out.println("connected..");
		} else {
			System.out.println("not connected");
		}
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM hr_employees WHERE id = 2");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			System.out.println("id: "+id+" name: "+name+" salary: "+salary);
		}
		
//		PreparedStatement ps = connection.prepareStatement
//				("INSERT INTO `hr_employees` (`name`, `salary`, `dpartment_id`) VALUES (?,?,?)");
//		ps.setString(1, "Test");
//		ps.setDouble(2, 500);
//		ps.setInt(3, 2);
//		ps.execute();
		
		PreparedStatement ps2 = connection.prepareStatement("UPDATE hr_employees SET salary=? WHERE id = ?");
		ps2.setDouble(1, 5000);
		ps2.setInt(2, 2);
		ps2.execute();
		
		
		Statement statement2 = connection.createStatement();
		ResultSet rs2 = statement2.executeQuery("SELECT * FROM hr_employees WHERE id = 2");
		while (rs2.next()) {
			int id = rs2.getInt("id");
			String name = rs2.getString("name");
			double salary = rs2.getDouble("salary");
			System.out.println("id: "+id+" name: "+name+" salary: "+salary);
		}
	}

//   public static void main(String[] args) {
//   Connection conn = null;
//   Statement stmt = null;
//   try{
//      //STEP 2: Register JDBC driver
//      Class.forName("com.mysql.jdbc.Driver");
//
//      //STEP 3: Open a connection
//      System.out.println("Connecting to database...");
//      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//
//      //STEP 4: Execute a query
//      System.out.println("Creating statement...");
//      stmt = conn.createStatement();
//      String query;
//      query = "SELECT * FROM hr_employees";
//      ResultSet rs = stmt.executeQuery(query);
//
//      //STEP 5: Extract data from result set
//      while(rs.next()){
//         //Retrieve by column name
//         int id  = rs.getInt("id");
//         String name = rs.getString("name");
//         double salary=rs.getDouble("salary");
//
//         //Display values
//         System.out.print("ID: " + id);
//         System.out.print(", name: " + name);
//         System.out.print(", salary: " + salary);
//         System.out.println();
//      }
//      //STEP 6: Clean-up environment
//      rs.close();
//      stmt.close();
//      conn.close();
//   }catch(SQLException se){
//      //Handle errors for JDBC
//      se.printStackTrace();
//   }catch(Exception e){
//      //Handle errors for Class.forName
//      e.printStackTrace();
//   }finally{
//      //finally block used to close resources
//      try{
//         if(stmt!=null)
//            stmt.close();
//      }catch(SQLException se2){
//      }// nothing we can do
//      try{
//         if(conn!=null)
//            conn.close();
//      }catch(SQLException se){
//         se.printStackTrace();
//      }//end finally try
//   }//end try
//   System.out.println("Goodbye!");
//}//end main
}// end FirstExample