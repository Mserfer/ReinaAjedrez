package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	private static final Color COLOR = Color.BLANCO;
	
	private Posicion posicion;
	private Color color;
	
	public Reina() {
		
		posicion = new Posicion(1, 'd'); 
	}
	
	
	public void setColor(Color color) {
		
		if (color == null) {
			throw new NullPointerException("El color del personaje no puede ser nulo.");
		}
		this.color = color;
	}
	
	public Color getColor() {
		
		return color;
	}
	
	public void setPosicion(Posicion posicion) {
		
		if (posicion == null) {
			throw new NullPointerException("La posición del personaje no puede ser nula.");
		}
		this.posicion = posicion;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	
	
	
	
	
	

}
