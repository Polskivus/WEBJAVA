package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modeloDAO.ModeloUsuario;

/**
 * Servlet implementation class InsertarUsuario
 */
@WebServlet("/InsertarUsuario")
public class InsertarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("/Vista/agregarUsuario.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		modeloUsuario.abrirconexion();

		String nombre = request.getParameter("nombre");
		String dni = request.getParameter("dni");
		int edad = Integer.parseInt(request.getParameter("edad"));

		Usuario usuario = new Usuario();

		usuario.setNombre(nombre);
		usuario.setDni(dni);
		usuario.setEdad(edad);
		
		modeloUsuario.insertarUsuario(usuario);

		modeloUsuario.cerrarconexion();
		
		request.getRequestDispatcher("ServletUsuario").forward(request, response);

	}
}