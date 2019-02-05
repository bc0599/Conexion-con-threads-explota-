package com.bcm.hilo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Conexion c;
	public static boolean muerte=false;
	static int contador=0;
	
	static final String URL = "jdbc:postgresql://localhost:5432/inventario";
	static final String USER = "postgres";
	static final String PASS = "masterkey";
	 
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
		
		 try {
	          
			    Class.forName("org.postgresql.Driver");
				Connection conexion = DriverManager.getConnection(URL, USER, PASS);
				
			}catch (SQLException e) {
				System.out.println(" " + e.getMessage());
				muerte = true;
			}catch(ClassNotFoundException ex) {
	            System.out.print("Error con el driver");
	            muerte = true;
	            }
     contador++;
	
	return null;
	}

}
