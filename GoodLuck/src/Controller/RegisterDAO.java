package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
	public void addGood(Registerpojo registerpojo) throws ClassNotFoundException, SQLException
	{
		String firstname=registerpojo.getFirstname();
		String lastname=registerpojo.getLastname();
		String username=registerpojo.getUsername();
		String password=registerpojo.getPassword();
		String email=registerpojo.getEmail();
		
		ConnectionManagement cm=new ConnectionManagement();
		String sql="insert into GoodDetails(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		PreparedStatement st=cm.getConnection().prepareStatement(sql);
		
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, username);
		st.setString(5, password);
		st.setString(6, password);
		st.setString(7, email);
		
		st.executeUpdate();
		cm.getConnection().close();
		
	}
}
