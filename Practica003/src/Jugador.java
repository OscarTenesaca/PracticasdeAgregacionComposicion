
public class Jugador {

	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String camiseta;
	private String Salario;
	
	
	public Jugador(int id, String cedula, String nombre, String apellido, String camiseta, String salario) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.camiseta = camiseta;
		this.Salario = salario;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}
	public String getSalario() {
		return Salario;
	}
	public void setSalario(String salario) {
		Salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", camiseta=" + camiseta + ", Salario=" + Salario + "]";
	}
	
	
	
	
}
