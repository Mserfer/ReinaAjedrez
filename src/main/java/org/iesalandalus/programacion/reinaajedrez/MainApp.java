package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	static Reina reina;
	
	private static void ejecutarOpcion(int opcion) {
		
		switch (opcion) {
		case 1: 
			crearReina();
			break;
		
		case 2: 
			crearReinaColor();
			break;
		case 3:
			mover();
			break;
		case 4: 
			Consola.despedirse();
			break;
		}
		
	}
	
	private  static  void crearReina() {
		
		reina = new Reina();
	}
	
	private static  void crearReinaColor() {
		
		reina = new Reina(Consola.elegirColor());
	}
	
	private static  void mover(){
		Direccion direccion;
		int numeroPasos;
		
		Consola.mostrarMenuDirecciones();
		direccion = Consola.elegirDireccion();
		numeroPasos = Consola.elegirPasos();
		try {
			reina.mover(direccion, numeroPasos);
		} catch (OperationNotSupportedException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int opcion;
		do {
			
			Consola.MostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			
			ejecutarOpcion(opcion);
			
		}while(opcion != 4);
		
		
		
		
	}
}
