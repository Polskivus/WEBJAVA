package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import conexion.Conexion;
import modelo.Usuario;

public class ModeloUsuario extends Conexion {

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

}
