package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CTester {
	
	public static Connection getConnection(){
	
			Connection con=null;
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch(ClassNotFoundException ce){
				ce.printStackTrace();
			}
			
			try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","scott","tiger");
			} catch (SQLException se) {
				se.printStackTrace();
			}
			return con;
	}
}