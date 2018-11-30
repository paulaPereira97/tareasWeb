<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="app.negocio.Producto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="encontrado" class="app.negocio.Producto" scope="request"></jsp:useBean>
	<ul>
		<li>ID: <jsp:getProperty property="id" name="encontrado"/> </li>
		<li>Descripcion: <jsp:getProperty property="descripcion" name="encontrado"/> </li>
		<li>Precio: <jsp:getProperty property="precio" name="encontrado"/> </li>
	</ul>

</body>
</html>