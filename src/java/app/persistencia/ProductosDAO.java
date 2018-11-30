package app.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.modelo.Producto;

import java.sql.PreparedStatement;

public class ProductosDAO implements ItfzProductosDAO{
	
	private Connection conexion;
	
	private void abrirConexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "root");
		}catch(Exception ex){
			System.out.println("Error al abrir la bbdd");
			ex.printStackTrace();
		}
		
	}
	
	private void cerrarConexion(){
		try {
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error al cerrar la conexion");
			e.printStackTrace();
		}
	}

	@Override
	public List<Producto> consultarTodos() {
		
		List<Producto> lista = new ArrayList<Producto>();
		
		try {
			abrirConexion();
			PreparedStatement pstm = conexion.prepareStatement("select * from PRODUCTOS");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				lista.add(new Producto(rs.getInt("ID"), rs.getString("DESCRIPCION"), rs.getDouble("PRECIO")));
			}
			
		} catch (Exception e) {
			System.out.println("Error al consultar todos");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		return lista;
	}

	@Override
	public Producto buscarProducto(int id) {
		Producto producto = new Producto();
		
		try {
			abrirConexion();
			PreparedStatement pstm = conexion.prepareStatement("select * from PRODUCTOS where ID = ?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				producto = new Producto(rs.getInt("ID"), rs.getString("DESCRIPCION"), rs.getDouble("PRECIO"));
			}
			
		} catch (Exception e) {
			System.out.println("Error al buscar el producto con id " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		return producto;
	}
        
        public Producto borrarProducto(int id) {
		Producto producto = new Producto();
		
		try {
			abrirConexion();
			PreparedStatement pstm = conexion.prepareStatement("DELETE * FROM PRODUCTOS where ID = ?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				producto = new Producto(rs.getInt("ID"), rs.getString("DESCRIPCION"), rs.getDouble("PRECIO"));
			}
			
		} catch (Exception e) {
			System.out.println("Error al buscar el producto con id " + id);
			e.printStackTrace();
		} finally {
			
		}
		
		return producto;
	}
        
          public Producto agregarProducto(String des, double precio) {
		Producto producto = new Producto();
		
		
			abrirConexion();
			PreparedStatement pstm = conexion.prepareStatement("insert into PRODUCTOS(?,?)");
			
			cerrarConexion();
		
		
		return producto;
	}

}
