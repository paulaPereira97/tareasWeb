
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="InsertarProducto" method="post">
            <label>Inserta un producto</label>
            
            <label>Descripcion</label>
            <input type="text" name="descripcion" required>
            
           <label>Precio</label>
            <input type="number" name="precio" required>
            
            <button type="submit" id="btn1">Agregar</button>
            


            
        </form>
        <h1>Hello World!</h1>
    </body>
</html>
