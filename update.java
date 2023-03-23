import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Set up the connection parameters - URL, user name & password and establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xebia_training", "root", "antara123");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int sid = sc.nextInt();
		System.out.println("Enter name: ");
		String sName = sc.next();
		
		// Prepare the SQL statement
		// Define SQL statement to update the name of record with SID = 5
		PreparedStatement pStatement = connection.prepareStatement("UPDATE STUDENT SET sname = ? WHERE sid = ?");
		// Set the new name and SID values
		pStatement.setInt(2, sid);
		pStatement.setString(1, sName);
		 // Execute the update statement
		int c = pStatement.executeUpdate();
		// Print the number of affected rows
		System.out.println(c+" record updated");
		// Close the database connection
		connection.close();
	}
}
