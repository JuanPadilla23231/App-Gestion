package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Repository.Conexion;

public class PersonaDAO {
	//Conexion cn=new Conexion();
	//Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public static void main(String[] arg) {
		String user = "Padillj";
	 String pass = "Padillj";
				
		Validar(user, pass);
		
				
	}
	
	public static  Persona Validar(String user, String contrasena){
		
		Connection con = null;
		//Statement stm = null;
		ResultSet rs = null;
		PreparedStatement ps;
		
		Persona perso =  new Persona();
		String sql = "select * from appgestionclientes.usuarios where Usuario_ID =" + "'Padillj'" + "and Contrasena ="+ "'Hola123'";
		
		try {
			con=Conexion.Conexion();
			
			//stm = con.createStatement();
			
			ps=con.prepareStatement(sql);
			//ps.setString(1,"Padillj");
			//ps.setString(2,"Hola123");
			rs=ps.executeQuery();
			//System.out.println("El valor es: " + rs);	
			while (rs.next()) {
				perso.setIdUsuario(rs.getString("Usuario_ID"));
			    perso.setContrasena(rs.getString("Contrasena"));
			    System.out.println("El IDUsuario tiene valor " + perso.getIdUsuario() );
			    System.out.println("El IDUsuario tiene valor " + perso.getContrasena() );
			}
			
			
		}catch(Exception e) {
			
		}
		
		return perso;
	}

}
