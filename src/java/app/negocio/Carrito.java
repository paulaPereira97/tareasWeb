package app.negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import app.modelo.Producto;

public class Carrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5964763803801216036L;
	
	private List<Producto> contenido = new ArrayList<Producto>();
	private double importe;
	
	public void addProducto(int id){
		ItfzNegocioProductos negocio = new NegocioProductos();
		Producto encontrado = negocio.buscarProducto(id);
		contenido.add(encontrado);
		importe += encontrado.getPrecio();
	}
	
	public void sacarProducto(int id){
		// Esto no funciona
//		ItfzNegocioProductos negocio = new NegocioProductos();
//		Producto encontrado = negocio.buscarProducto(id);
//		contenido.remove(encontrado);
		
//
		Producto encontrado = null;
		for(Producto p : contenido){
			if (id == p.getId()){
				encontrado = p;
				
			}
		}
		contenido.remove(encontrado);
		importe -= encontrado.getPrecio();
		
	}
	
	public List<Producto> getContenido() {
		return contenido;
	}
	
	public double getImporte() {
		return importe;
	}

}
