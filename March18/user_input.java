import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class user_input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Set up the connection parameters - URL, user name & password and establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xebia_training", "root", "antara123");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int sid = sc.nextInt();
		System.out.println("Enter name: ");
		String sName = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		PreparedStatement pStatement = connection.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?)");
		pStatement.setInt(1, sid);
		pStatement.setString(2, sName);
		pStatement.setInt(3, age);
		int c = pStatement.executeUpdate();
		System.out.println(c+" record inserted");
		connection.close();
	}

}
