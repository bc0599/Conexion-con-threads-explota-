package com.bcm.hilo;

import java.sql.SQLException;

public class BHilo extends Thread {
	
		public static Conexion c;
		
		public BHilo(Conexion c) {
			super();
			BHilo.c=c;
			start();
		}
		
		public void run() {
			if(!(Conexion.muerte)) {
				try {
					c.crearConexion();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(" Se han realizado " + Conexion.contador + " conexiones.");
			}else {
				System.out.println("Hay problemas con la base de datos");
			}
		}
	}

