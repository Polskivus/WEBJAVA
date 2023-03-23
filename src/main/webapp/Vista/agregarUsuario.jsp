<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="InsertarUsuario">
		<label for="nombre">Nombre</label> <input type="text" name="nombre">
		<label for="dni">DNI</label> <input type="text" name="dni"> <br>
		<label for="edad">Edad</label> <input type="text" name="edad">
		<br> <input type="submit" value="Enviar">
	</form>
</body>
</html>