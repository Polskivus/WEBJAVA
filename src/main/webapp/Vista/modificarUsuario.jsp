<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	Usuario user = (Usuario) request.getAttribute("user");
	%>

	<form method="post" action="EditarUsusario">
		<lable for="id">ID</lable>
		
		<lable for="nombre">Nombre</lable>
		<input type="text" name="nombre"
			value="<%out.println(user.getNombre());%>">
			
		<lable for="dni">DNI</lable>
		<input type="text" name="dni"
			value="<%out.println(user.getDni());%>"> <label for="edad">Edad</label>
		
		<input type="text" name="edad"
			value=" <%out.println(user.getEdad());%> "> 
			
			<input type="submit" value="Enviar">
	</form>
</body>
</html>