package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	
	private Posicion posicion;
	private Color color;
	
	public Reina() {
		
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}
	
	public Reina(Color color) {
		
		setColor(color);
		
		if(color == Color.NEGRO) {
			
			posicion = new Posicion(1, 'd');
		}
		if(color == Color.BLANCO) {
			
			posicion = new Posicion(8, 'd');
			
		}
		
	}
	
	
	public void setColor(Color color) {
		
		if (color == null) {
			throw new NullPointerException("La reina debe tener algun color.");
		}
		this.color = color;
	}
	
	public Color getColor() {
		
		return color;
	}
	
	public void setPosicion(Posicion posicion) {
		
		if (posicion == null) {
			throw new NullPointerException("La reina debe tener alguna posicion.");
		}
		this.posicion = posicion;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	
	public void Mover(Direccion direccion, int pasosQueMovemos)throws OperationNotSupportedException {
		
		try {
			
			if(pasosQueMovemos < 1 || pasosQueMovemos > 7) {
				
				throw new IllegalArgumentException("La cantidad de pasos introducida no esta permitida");	
			}
			
			if(direccion == null) {
				
				throw new NullPointerException("La reina debe avanzar en alguna direccion");
			}
			
		}catch (IllegalArgumentException e) {
			
			throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
		}
	}
	
	@Override
	public String toString() {
		
		return String.format("color=%s, posicion=(%s)", color, posicion);

	}
	
	
	

}
