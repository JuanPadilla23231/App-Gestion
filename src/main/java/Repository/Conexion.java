package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

public class Conexion {
	 private static	Connection con;
	 private static String usuario = "root";	
	 private static String password = "1234";	
	 private static String url = "jdbc:mysql://localhost:3306/appgestionclientes";
    
	public static Connection Conexion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,usuario,password);
			System.out.println(" cargar el driver JDBC: " + con);
			
		}catch (SQLException e){
			e.printStackTrace();
			System.err.println("Error de SQL: " + e.getMessage());
		}catch (ClassNotFoundException e){
	       e.printStackTrace();
	       System.err.println("Error al cargar el driver JDBC: " + e.getMessage());
		}
		
		
	return con;	
	}
	
}
