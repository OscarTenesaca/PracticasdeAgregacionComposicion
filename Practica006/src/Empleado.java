
public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private double sueldo;

	public Empleado(int id, String nombre, String apellido, double sueldo) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
	}

}
