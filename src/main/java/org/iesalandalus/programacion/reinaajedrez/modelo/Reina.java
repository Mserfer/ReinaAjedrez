package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	public Reina() {
		
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1,'d'));
		
	}
	
	public Reina(Color color) {
		
		setColor(color);
		
		if(color == Color.NEGRO) {
			
			posicion = new Posicion(8, 'd');
		}
		if(color == Color.BLANCO) {
			
			posicion = new Posicion(1, 'd');
			
		}
		
	}
	
	
	public void setColor(Color color) {
		
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
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
	
	
	public void mover(Direccion direccion, int pasosQueMovemos)throws OperationNotSupportedException {
		
			
			if(direccion == null) {
				throw new NullPointerException("ERROR: La dirección no puede ser nula.");
			}
			
			if(pasosQueMovemos < 1 || pasosQueMovemos > 7) {
				
				throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");	
			}
			
			
			try {
				
			switch (direccion) {
			case NORTE:
				
				posicion = new Posicion(posicion.getFila()+pasosQueMovemos,(posicion.getColumna()));
					
				break;
				
			case NORESTE : 
				
				posicion = new Posicion(posicion.getFila()+pasosQueMovemos, (char)(posicion.getColumna()+pasosQueMovemos));
				break;
				
			case NOROESTE:
				
				posicion = new Posicion(posicion.getFila()+pasosQueMovemos, (char)(posicion.getColumna()-pasosQueMovemos));
				break;
				
			case ESTE :
				
				posicion = new Posicion(posicion.getFila(), (char)(posicion.getColumna()+pasosQueMovemos));
				break;
				
			case OESTE :
				
				posicion = new Posicion(posicion.getFila(), (char)(posicion.getColumna()-pasosQueMovemos));
				break;
				
			case SURESTE : 
				
				posicion = new Posicion(posicion.getFila()-pasosQueMovemos, (char)(posicion.getColumna()+pasosQueMovemos));
				break;
				
			case SUROESTE:
				
				posicion = new Posicion(posicion.getFila()-pasosQueMovemos, (char)(posicion.getColumna()-pasosQueMovemos));
				break;
				
			case SUR:
				
				posicion = new Posicion(posicion.getFila()-pasosQueMovemos, (posicion.getColumna()));
				break;
			}
			
				
			
		}catch (IllegalArgumentException e) {
			
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
	}
	/*erride
	public String toString() {
		
		return String.format("color=%s, posicion=(%s)", color, posicion);

	}*/

	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion.toString() + ")";
	}


	
	
	

}
