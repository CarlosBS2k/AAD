package com.carlos.serializacion.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Coche implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String modelo;
	private int numRuedas;
	
	public Coche(String modelo, int numRuedas) {
		super();
		this.modelo = modelo;
		this.numRuedas = numRuedas;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(modelo, numRuedas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(modelo, other.modelo) && numRuedas == other.numRuedas;
	}
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", numRuedas=" + numRuedas + "]";
	}
	
	
}
