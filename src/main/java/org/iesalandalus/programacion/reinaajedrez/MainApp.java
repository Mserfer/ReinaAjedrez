package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private int numeroPasos;
	Reina reina;
	Consola consola;
	Direccion direccion;
	
	private void ejecutarOpcion(int opcion) {
		
		consola.elegirOpcionMenu();
	}
	
	private void crearReina() {
		
		reina = new Reina();
	}
	
	private void crearReinaColor(Color color) {
		
		reina = new Reina(color);
	}
	
	private void mover(){
		
		consola.mostrarMenuDirecciones();
		direccion = consola.elegirDireccion();
		numeroPasos = consola.elegirPasos();
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		MainApp app = new MainApp();
		
		app.mover();
		
		
		
	}
}
