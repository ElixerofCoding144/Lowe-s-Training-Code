import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) throws Exception{
		//Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment_march19", "root", "antara123");
	   
	    
	    // -----------------CREATE the values for the new record-------------------
	    // Prepare the SQL statement to insert a new record
		System.out.println("CREATING RECORD");
	    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customer VALUES (?,?,?,?)");
	    pstmt.setInt(1, 6);
	    pstmt.setString(2, "Selen Geller");
	    pstmt.setString(3, "Canada");
	    pstmt.setInt(4, 35);
	    // Execute the insert statement
	    int rows = pstmt.executeUpdate();	    
	    // Print the number of affected rows
	    System.out.println(rows + " row(s) inserted");
	    
	    //------------------READING the values---------------------
	    // Execute the select statement
	    System.out.println("READING RECORD");
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
	    // Process the result set
	    while (rs.next()) {
	        System.out.println(rs.getInt("cid") + " " + rs.getString("cname") + " " + rs.getString("loc") + " " + rs.getInt("age"));
	    }
	    
	    //---------------------------UPDATE the values --------------------------------
	    System.out.println("UPDATING RECORD");
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int cid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String cname = sc.next();
		System.out.println("Enter location: ");
		String loc = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		// Prepare the SQL statement
		// Define SQL statement to update the name of record with SID = 5
		PreparedStatement pStatement = conn.prepareStatement("UPDATE customer SET cname = ?, loc = ?, age = ? WHERE cid = ?");
		// Set the new name new location new age and cid values
		pStatement.setString(1, cname);
		pStatement.setString(2, loc);
		pStatement.setInt(3, age);
		pStatement.setInt(4, cid);
		 // Execute the update statement
		int r = pStatement.executeUpdate();
		// Print the number of affected rows
		System.out.println(r+" record updated");
		// Close the database connection
		
		//-----------------------DELETE the values-------------------
		System.out.println("DELETING RECORD");
		System.out.println("Enter id: ");
		cid = sc.nextInt();
		
		// Prepare the SQL statement
		// Define SQL statement to update the name of record with SID = 5
		pStatement = conn.prepareStatement("DELETE FROM customer WHERE cid = ?");
		// Set the new name and SID values
		pStatement.setInt(1, cid);
		// Execute the update statement
		int c = pStatement.executeUpdate();
		// Print the number of affected rows
		System.out.println(c+" record deleted");
		
		//Closing 
		pstmt.close();
		stmt.close();
		pStatement.close();
		conn.close();
	}
}
