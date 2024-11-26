package Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Prueba {
//	Conexion cn=new Conexion();
	public static void main(String[] arg) {
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = Conexion.Conexion();
			stm = cn.createStatement();
			rs = stm.executeQuery("select * from appgestionclientes.usuarios");
		while(rs.next()) {
			String usuario_ID = rs.getString(1);
			String nombre = rs.getString(2);
			String contrasena = rs.getString(3);
			String edad = rs.getString(4);
			String sexo = rs.getString(5);
			System.out.println(usuario_ID + "/"+ nombre +"/"+ contrasena +"/"+ edad +"/"+ sexo );
		}			
		
		}catch (SQLException e) {
			
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if  (stm != null) {
					stm.close();
				}
				if  (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
