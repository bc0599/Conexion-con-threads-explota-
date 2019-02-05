package com.bcm.hilo;

import java.util.ArrayList;

public class Main {
	private static ArrayList<BHilo> groupHilos = new ArrayList<>();
	private static Conexion c;
	
	public static void main(String[] args) {
		Boom(101);
	}

	
	private static void Boom(int i) {
		for (int j = 0; j < i; j++) {	
			groupHilos.add(new BHilo(c));
		}
		System.out.println("Exito.");
	}
}
