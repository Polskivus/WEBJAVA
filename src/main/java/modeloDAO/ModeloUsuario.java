package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.catalina.User;
import org.eclipse.jdt.internal.compiler.ast.SuperReference;

import conexion.Conexion;
import modelo.Usuario;

public class ModeloUsuario extends Conexion {

	public void insertarUsuario(Usuario usuario) {

		String insert = "INSERT into users (nombre, dni, edad) values (?, ? , ?)";

		try {
			PreparedStatement pst = super.conexion.prepareStatement(insert);

			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getDni());
			pst.setInt(3, usuario.getEdad());

			pst.execute();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Usuario> getusers() {

		String recogeruserString = "SELECT * FROM users";

		ArrayList<Usuario> users = new ArrayList<Usuario>();

		try {

			PreparedStatement recogerunuser = super.conexion.prepareStatement(recogeruserString);

			ResultSet resultusers = recogerunuser.executeQuery();

			while (resultusers.next()) {

				Usuario user = new Usuario();

				user.setId(resultusers.getInt("ID"));
				user.setNombre(resultusers.getString("Nombre"));
				user.setDni(resultusers.getString("DNI"));
				user.setEdad(resultusers.getInt("edad"));

				users.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

	public void deluseres(int id) {

		String delete = "DELETE FROM users WHERE id=?";

		try {

			PreparedStatement deleteuser = super.conexion.prepareStatement(delete);

			deleteuser.setInt(1, id);

			deleteuser.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuario verUnUsuario(int id) {

		Usuario user = new Usuario();

		String unUsuario = "SELECT * FROM useres WHERE id=?";

		try {

			PreparedStatement Veruno = super.conexion.prepareStatement(unUsuario);
			ResultSet resultSet = Veruno.executeQuery(unUsuario);

			while (resultSet.next()) {

				user.setNombre(resultSet.getString("nombre"));
				user.setDni(resultSet.getString("dni"));
				user.setEdad(resultSet.getInt("edad"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	public void modificarUser(Usuario usuario) {

		String modify = "UPDATE users SET nombre=?, dni=?,edad=? WHERE id=?";

		try {

			PreparedStatement modifyuser = super.conexion.prepareStatement(modify);

			modifyuser.setString(1, usuario.getNombre());
			modifyuser.setString(2, usuario.getDni());
			modifyuser.setInt(3, usuario.getEdad());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
