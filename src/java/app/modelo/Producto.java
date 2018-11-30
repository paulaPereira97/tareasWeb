package app.modelo;

import java.io.Serializable;

public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8049435758618953119L;
	
	
	private int id;
	private String descripcion;
	private double precio;
	
	
	public Producto() {
	
	}


	public Producto(int id, String descripcion, double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}
	
	
	
}
