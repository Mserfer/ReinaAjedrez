package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private int opcion;
	private int color;
	private int direccion;
	private int cantidadPasos;
	
	private String colorElegido;
	private String direccionElegida;
	
	private Direccion claseDireccion;
	
	private Consola() {};
	
	public void MostrarMenu() {
		
		System.out.println("1 = Crear reina por defecto");
		System.out.println("2 = Crear reina eligiendo el color");
		System.out.println("3 = Mover");
		System.out.println("4 = Salir");
	}
	
	public int elegirOpcionMenu() {
		
		
		do {
			
			System.out.println("Introduzca por teclado la accion a realizar");
			opcion = Entrada.entero();
			
		}while(opcion < 1 || opcion > 4);
		
		return opcion;

	}
	
	public String elegirOpcion() {
		
		do {
			
			System.out.println("Elija un color, debe  ser negro o blanco");
			System.out.println("Blanco = 1");
			System.out.println("Negro = 2");
			
			color = Entrada.entero();
			
		}while(color != 1 || color != 2);
		
		if(color == 1) {
			
			colorElegido = "Blanco";
		}
		if(color == 2) {
			
			colorElegido = "Negro";
		}
		return colorElegido;
		
	
	}
	
	public void mostrarMenuDirecciones() {
		
		System.out.println("Las direcciones a elegir son : ");
		System.out.println("norte, noreste, noroeste, sur, suroeste, sureste, este y oeste");
	}
	
	public Direccion  elegirDireccion() {
		
		
		do {
		
		System.out.println("Elija una direccion : ");
		System.out.println("Norte = 1, Noreste = 2, Noroeste = 3, Sur = 4, Suroeste = 5, Sureste = 6, Este = 7, Oeste = 8");
		this.direccion = Entrada.entero();
		
		}while(direccion < 1 || direccion > 8);
		
		switch (direccion) {
		
		case 1 : 
			
			direccionElegida = "Norte";
			
			claseDireccion = Direccion.NORTE;
			break;
		case 2 : 
			direccionElegida = "Noreste";
			claseDireccion = Direccion.NORESTE;
			break;
			
		case 3:
			direccionElegida = "Noroeste";
			claseDireccion = Direccion.NOROESTE;
			break;
		case 4:
			direccionElegida = "Sur";
			claseDireccion = Direccion.SUR;
			break;
		case 5:
			direccionElegida = "Suroeste";
			claseDireccion = Direccion.SUROESTE;
			break;
		case 6: 
			direccionElegida = "Sureste";
			claseDireccion = Direccion.SURESTE;
			break;
		case 7:
			direccionElegida = "Este";
			claseDireccion = Direccion.ESTE;
			break;
		case 8:
			direccionElegida = "Oeste";
			claseDireccion = Direccion.OESTE;
			break;
			
		}
		
		return claseDireccion;

	}
	
	public int elegirPasos() {
		
		System.out.println("Introduzca la cantidad de pasos a mover");
		cantidadPasos = Entrada.entero();
		
		return cantidadPasos;
		
	}
	
	public void despedirse() {
		
		System.out.println("Hasta luego lucas");
	}
	

}
