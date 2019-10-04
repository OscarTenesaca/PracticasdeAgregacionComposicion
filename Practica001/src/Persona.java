
public class Persona {
	private int idPersona;
	private String cedula;
	private String nombre;
	private String apellido;
	private String ciudad;
	
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", ciudad=" + ciudad + "]";
	}
	public Persona(int idPersona, String cedula, String nombre, String apellido, String ciudad) {
		super();
		this.idPersona = idPersona;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

}
