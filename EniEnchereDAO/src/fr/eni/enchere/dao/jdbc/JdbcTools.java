package fr.eni.enchere.dao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import fr.eni.enchere.dao.Settings;

public class JdbcTools {

	
	private static  String urldb;
	private static String userdb;
	private static String passworddb;
	
	static {
		
		try {
			Class.forName(Settings.getProperty("driverdb"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		urldb = Settings.getProperty("urldb");
		userdb = Settings.getProperty("userdb");
		passworddb = Settings.getProperty("passworddb");
		System.out.println("urldb="+urldb+";userdb="+userdb+";passworddb="+passworddb);
	}
	
	
	
	public static Connection getConnection() throws SQLException{
		//Connection connection = DriverManager.getConnection(urldb);
		Connection cnx = DriverManager.getConnection(urldb, userdb, passworddb);
		/*InitialContext ctx=null;
		DataSource ds=null;
		 Connection cnx=null;
		try {
			ctx=new InitialContext();
		    ds=(DataSource)ctx.lookup("java:comp/env/jdbc/poolCnx");
		   	cnx=ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		return cnx;
	}
	


}


