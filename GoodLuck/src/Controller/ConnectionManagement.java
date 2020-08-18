package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagement {
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYS","password");
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Purnima");
		 
		 return con;
	}
}
