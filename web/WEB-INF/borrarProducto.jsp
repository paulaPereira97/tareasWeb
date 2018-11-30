<%-- 
    Document   : newjsp
    Created on : 30-nov-2018, 13:31:39
    Author     : Paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="borrarProducto" method="POST"></form>
        <label>id: </label>
        <input type="number" name="descripcion" required><select name="id">
            <%
                ArrayList<Producto> listaProductos = ProductosDAO.getInstance().extraerId();
                
                for(int i =0; i < listaProductos.size(); i++){
                    int id = listaProductos.get(i).getId();
 
                }
                
                %>
        </select>
        <button type="submit" id="btn1">Enviar</button>
    </body>
</html>
