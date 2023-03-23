import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class operations_database {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//1. Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Set up the connection parameters - URL, user name & password and establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xebia_training", "root", "antara123");
		PreparedStatement pStatement = connection.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?)");
		pStatement.setInt(1, 4);
		pStatement.setString(2, "Antara");
		pStatement.setInt(3, 23);
		int c = pStatement.executeUpdate();
		System.out.println(c+" record inserted");
		connection.close();
	}
}

