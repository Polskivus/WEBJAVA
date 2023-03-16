package modelo;

public class Usuario {

	int id;
	String nombre;
	String dni;
	int edad;

	public Usuario() {
	};

	public Usuario(int id, String nombre, String dni, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	
	
}
