import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private int id;
	private String nombre;
	private String direccion;
	private String correo;
	private List<Departamento> departementoList;

	public Empresa(int id, String nombre, String direccion, String correo) {

		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.departementoList = new ArrayList<Departamento>();
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void agregarDepartameno(Departamento departamento) {

		this.departementoList.add(departamento);

	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo
				+ ", departementoList=" + departementoList + "]";
	}

}
