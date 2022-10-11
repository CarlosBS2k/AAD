package com.carlos.xmljson.entidades;

import java.util.Objects;

public class Noticia {
	String titular;
	String descripcion;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, titular);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(titular, other.titular);
	}
	public Noticia(String titular, String descripcion) {
		super();
		this.titular = titular;
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", descripcion=" + descripcion + "]";
	}
	
}
