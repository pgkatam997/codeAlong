package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Purnima");
		
		if(con!=null) {
			System.out.println("Establish");
		}
	}

}