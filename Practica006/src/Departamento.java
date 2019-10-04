import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private int id;
	private String nombre;
	private String sede;
	private List<Empleado> empleadoList;

	public Departamento(int id, String nombre, String sede) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sede = sede;
		this.empleadoList = new ArrayList<Empleado>();

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

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public List<Empleado> getEmpleadoList() {
		return empleadoList;
	}

	public void setEmpleadoList(List<Empleado> empleadoList) {
		this.empleadoList = empleadoList;
	}

	public void agregarEmleado(Empleado empleado) {

		this.empleadoList.add(empleado);

	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", sede=" + sede + ", empleadoList=" + empleadoList
				+ "]";
	}

}
