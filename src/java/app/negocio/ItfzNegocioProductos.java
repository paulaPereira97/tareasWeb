package app.negocio;

import java.util.List;

import app.modelo.Producto;

public interface ItfzNegocioProductos {

	public List<Producto> consultarTodos();

	public Producto buscarProducto(int id);

	// .....
}
