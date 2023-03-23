import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_connection_steps {
	public static void main(String[] args) throws Exception{
		//1. Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Set up the connection parameters - URL, username & password and establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xebia_training", "root", "antara123");
		//3. Create a statement
		Statement statement = connection.createStatement();
		//4. Execute SQL 
		ResultSet resultSet = statement.executeQuery("select *from student");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));			
		}
	}
}
