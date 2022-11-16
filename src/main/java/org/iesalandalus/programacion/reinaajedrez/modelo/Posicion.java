package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		
		this.setColumna(columna);
		this.setFila(fila);
		
	}
	
	public Posicion(Posicion posicion) {
		
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
	}
	
	public void setFila(int fila) {
		
		if(fila < 1 || fila > 8) {
			
			throw new IllegalArgumentException("La filas deben tener un valor entre 1 y 8");
			
		}
			this.fila = fila;
		}
	
	public int getFila() {
		
		return fila;
	}
	
	public void setColumna(char columna) {
		
		if(columna < 'a'|| columna > 'h') {
			
			throw new IllegalArgumentException("Las columnas deben ser desde la 'a' a la 'h'");
			
		}
			this.columna = columna;
			
	
	}
	
	public char getColumna() {
		
		return columna;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Posicion)) {
			return false;
		}
		Posicion other = (Posicion) obj;
		return fila == other.fila && columna == other.columna;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fila, columna);
	}
	
	
	@Override
	public String toString() {
		return String.format("fila=%s, columna=%s ", fila, columna);
	}

}
