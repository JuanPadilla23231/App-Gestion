<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Controller.Validar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>Bienvenido, ingrese sus datos por favor.</h1>
      <form action= "ControlNewU"  method= "post"> 
         Usuario : <br>
         <input type="text"  name="usuari1"  value=""><br>
          Nombre Completo : <br>
         <input type="text"  name="nom1"  value=""><br>         
         Contraseña: <br>
         <input type="text"  name="coontra1"  value=""><br>
         telefono: <br>
         <input type="text"  name="eda1"  value=""><br>
    
         <input type="submit"   value="ingresar"><br>
          
           <a href= "index.jsp"> Regresar</a> <br> 
         </form>


</body>
</html>