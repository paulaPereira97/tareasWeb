<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="app.negocio.Producto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- Scriptlet de comentario
	
	<%! public void saludar(){
		System.out.println("Hola");
		} 
		
		private String nombre;%>
		
	<%@ directiva %>	
	
	<%= "Saludos" %>
	
	<% codigo Java %>   --%>
	
	<marquee> <%= application.getAttribute("msg") %>  </marquee>
	
	
	<% List<Producto> lista = (List)request.getAttribute("lista"); %>
	
	<table border="1" align="center">
		<tr>
			<th>ID</th>
			<th>Descripcion</th>
			<th>Precio</th>
			<th>Agregar al carrito</th>
		</tr>
		
		<% for(Producto p : lista){ %>
			<tr>
				<td> <%= p.getId() %>  </td>
				<td> <%= p.getDescripcion() %> </td>
				<td> <%= p.getPrecio() %> </td>
				<td> <a href="controlador?opcion=3&codigo=<%= p.getId() %>"> comprar </a> </td>
			</tr>
		<% } %>
	</table>
	

</body>
</html>