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
 * Servlet implementation class EditarUsuario
 */
@WebServlet("/EditarUsusario")
public class EditarUsusario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarUsusario() {
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

		int id = Integer.parseInt(request.getParameter("id"));

		ModeloUsuario buser = new ModeloUsuario();

		buser.abrirconexion();

		Usuario useramodificar = buser.getUsuario(id);

		request.setAttribute("user", useramodificar);

		request.getRequestDispatcher("/Vista/modificarUsuario.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModeloUsuario buser = new ModeloUsuario();
		buser.abrirconexion();

		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String dni = request.getParameter("dni");
		int edad = Integer.parseInt(request.getParameter("edad"));

		Usuario usuario = new Usuario();

		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setDni(dni);
		usuario.setEdad(edad);

		buser.modificarUser(usuario);
		
		buser.cerrarconexion();
		
		request.getRequestDispatcher("EditarUsusario").forward(request, response);
		
		response.sendRedirect(request.getContextPath() + "/controlador/ServletUsuario");
	}

}
