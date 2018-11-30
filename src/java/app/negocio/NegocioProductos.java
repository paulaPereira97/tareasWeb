package app.negocio;

import java.util.List;

import app.modelo.Producto;
import app.persistencia.ItfzProductosDAO;
import app.persistencia.ProductosDAO;

public class NegocioProductos implements ItfzNegocioProductos{
	
	ItfzProductosDAO dao = new ProductosDAO();

	@Override
	public List<Producto> consultarTodos() {
		// TODO Auto-generated method stub
		return dao.consultarTodos();
	}

	@Override
	public Producto buscarProducto(int id) {
		// TODO Auto-generated method stub
		return dao.buscarProducto(id);
	}

}
