import java.util.ArrayList;
import java.util.List;

public class Cargo {

	private int idCargo;
	private String descripcion;
	private String rol;
	private List<Persona> personaList;
	public int getIdCargo() {
		return idCargo;
	}
	public Cargo(int idCargo, String descripcion, String rol) {
		super();
		this.idCargo = idCargo;
		this.descripcion = descripcion;
		this.rol = rol;
		this.personaList= new ArrayList<Persona>();
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public List<Persona> getPersonaList() {
		return personaList;
	}
	public void setPersonaList(List<Persona> personaList) {
		this.personaList = personaList;
	}
	public void nuevaPersona(int c, String cedu, String n, String ape,String ciudad)
    {
        this.personaList.add(new Persona(c,cedu,n,ape,ciudad));
    }
	@Override
	public String toString() {
		return "Cargo [idCargo=" + idCargo + ", descripcion=" + descripcion + ", rol=" + rol + ", personaList="
				+ personaList + "]";
	}

	
	
}
