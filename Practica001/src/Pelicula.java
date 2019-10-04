import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private int idPersona;
	private String nombre;
	private String tipo;
	private List<Cargo> cargoList;
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Cargo> getCargoList() {
		return cargoList;
	}
	public void setCargoList(List<Cargo> cargoList) {
		this.cargoList = cargoList;
	}
	public Pelicula(int idPersona, String nombre, String tipo) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cargoList= new ArrayList<Cargo>();
	}
	@Override
	public String toString() {
		return "Pelicula [idPersona=" + idPersona + ", nombre=" + nombre + ", tipo=" + tipo + ", cargoList=" + cargoList
				+ "]";
	}
	public void agregarCargo(Cargo s) {
		   
		   
        this.cargoList.add(s);
   

	
}
	
	
}
