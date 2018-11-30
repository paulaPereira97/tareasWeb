<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="includes/header.jsp" %>
<%@include file="includes/nav.jsp" %>

	<form action="controlador">
		<label>Introduce Id del producto a buscar:</label>
		<input type="text" name="codigo" />
		<input type="hidden"  name="opcion" value="2"/>
		<input type="submit"  value="BUSCAR"/>
	</form>


<%@include file="includes/footer.jsp" %>

</body>
</html>