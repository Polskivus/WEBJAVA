<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Polideportivo usuarios</title>
</head>
<body style="padding-left: 10px">

	<%
	ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("users");
	%>
	<div style="width: 100%; display: flex; justify-content: space-between">
		<h1>Listado de usuarios</h1>

		<button type="button" class="btn btn-primary pull rigth btn-lg"><a style="color:white" href="InsertarUsuario">Añadir
			usuario</a></button>

	</div>


	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
		</div>
	</nav>

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
			%>
			<tr>
				<td>
					<%
					out.println(user.getId());
					%>
				</td>

				<td>
					<%
					out.println(user.getNombre());
					%>
				</td>

				<td>
					<%
					out.println(user.getDni());
					%>
				</td>

				<td>
					<%
					out.println(user.getEdad());
					%>
				</td>

				<td>
					<button>
						<a href="EditarUsusario?id=<%=user.getId()%>">Editar
					</button>
				</td>

				<td>
					<button>
						<a href="EliminarUsuario?id=<%=user.getId()%>">Eliminar</a>
					</button>
				</td>

				<%
				}
				;
				%>
			</tr>



		</tbody>


	</table>

</body>
</html>