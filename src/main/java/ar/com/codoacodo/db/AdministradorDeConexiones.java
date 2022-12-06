package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	public static Connection getConnection() throws Exception{
		String hosts = "localhost";
		String port = "3306";
		String username = "root";
		String password = "root";
		String dbName = "22549"; 
		
		//por usar JDBC, debo armar la url así: 
		String url = "jdbc:mysql://"+hosts+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
		
		//crear la instancia dinamicamente 
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		//Clase objeto = new Clase();
		Class.forName(driverClassName);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		
		
		
		return connection;
	}
}
