package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	
	public boolean Validate(Loginpojo loginpojo) throws ClassNotFoundException, SQLException {
		String username=loginpojo.getUsername();
		String password=loginpojo.getPassword();
		
		ConnectionManagement con=new ConnectionManagement();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("Select * from GoodDetails");
		
		while(rs.next()) {
			if(username.contentEquals(rs.getString("USERNAME")) && password.equals("PASSWORD")) {
				con.getConnection().close();
				return true;
			}
			else {
				con.getConnection().close();
				return false;
			}
		}
		return false;
		
	}
}
