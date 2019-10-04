
public class Proveedor {
 
	private int idProducto;
	private	String nombre; 
	private String apellido;
	private String empresa;
	
	@Override
	public String toString() {
		return "Proveedor [idProducto=" + idProducto + ", nombre=" + nombre + ", apellido=" + apellido + ", empresa="
				+ empresa + "]";
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Proveedor(int idProducto, String nombre, String apellido, String empresa) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
	}
	
	
	

}
