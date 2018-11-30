package app.persistencia;

import java.util.List;

import app.modelo.Producto;

public interface ItfzProductosDAO {
	
	public List<Producto> consultarTodos();
	
	public Producto buscarProducto(int id);
	
	// .....

}
