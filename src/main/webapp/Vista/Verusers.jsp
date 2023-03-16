<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Polideportivo usuarios</title>
</head>
<body>

	<%
	ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("users");
	
	%>

	<h1>Listado de usuarios</h1>
	<table class="usuarios">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Nombre</th>
				<th scope="col">DNI</th>
				<th scope="col">Edad</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Usuario user : usuarios) {
				out.println(user.getNombre());
				
				<tr>
				<td>a</td>
				<td>b</td>
				<td>c</td>
				<td>d</td>
			</tr>
			}
			%>
			

		</tbody>


	</table>
</body>
</html>