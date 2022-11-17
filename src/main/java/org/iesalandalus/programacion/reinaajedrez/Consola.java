package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private Consola() {};
	
	public static  void MostrarMenu() {
		
		System.out.println("1 = Crear reina por defecto");
		System.out.println("2 = Crear reina eligiendo el color");
		System.out.println("3 = Mover");
		System.out.println("4 = Salir");
	}
	
	public static int elegirOpcionMenu() {
		
		int opcion;
		
		do {
			
			System.out.println("Introduzca por teclado la accion a realizar");
			opcion = Entrada.entero();
			
		}while(opcion < 1 || opcion > 4);
		
		return opcion;

	}
	
	public static Color elegirColor() {
		
		int opcion;
		do {
			
			System.out.println("Elija un color, debe  ser negro o blanco");
			System.out.println("Blanco = 1");
			System.out.println("Negro = 2");
			
			opcion = Entrada.entero();
			
		}while(opcion != 1 || opcion != 2);
		
		if(opcion == 1) {
			
			return Color.BLANCO;
		}else {
			
			return Color.NEGRO;
		}
		
	
	}
	
	public static  void mostrarMenuDirecciones() {
		
		System.out.println("Las direcciones a elegir son : ");
		System.out.println("norte, noreste, noroeste, sur, suroeste, sureste, este y oeste");
	}
	
	public static Direccion  elegirDireccion() {
		
		Direccion direccion = Direccion.ESTE;
		int opcionDireccion;
		do {
		
		System.out.println("Elija una direccion : ");
		System.out.println("Norte = 1, Noreste = 2, Noroeste = 3, Sur = 4, Suroeste = 5, Sureste = 6, Este = 7, Oeste = 8");
		opcionDireccion = Entrada.entero();
		
		}while(opcionDireccion < 1 || opcionDireccion > 8);
		
		switch (opcionDireccion) {
		
		case 1 : 
				
			direccion = Direccion.NORTE;
			break;
		case 2 : 
			direccion = Direccion.NORESTE;
			break;
			
		case 3:
			direccion = Direccion.NOROESTE;
			break;
		case 4:
			direccion = Direccion.SUR;
			break;
		case 5:

			direccion = Direccion.SUROESTE;
			break;
		case 6: 

			direccion = Direccion.SURESTE;
			break;
		case 7:
			direccion = Direccion.ESTE;
			break;
		case 8:
			
			direccion = Direccion.OESTE;
			break;
			
		}
		
		return direccion;

	}
	
	public static int elegirPasos() {
		int cantidadPasos;
		System.out.println("Introduzca la cantidad de pasos a mover");
		cantidadPasos = Entrada.entero();
		
		return cantidadPasos;
		
	}
	
	public static void despedirse() {
		
		System.out.println("Hasta luego lucas");
	}
	

}
