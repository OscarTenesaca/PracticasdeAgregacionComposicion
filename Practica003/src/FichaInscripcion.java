import java.util.ArrayList;
import java.util.List;

public class FichaInscripcion {
	
	
	
	private	int id; 
	private	String delegado; 
	private String dirección;
	private String celular;
	private  List<Equipo> equipoList;
	
	
	public FichaInscripcion(int id, String delegado, String dirección, String celular) {
		super();
		this.id = id;
		this.delegado = delegado;
		this.dirección = dirección;
		this.celular = celular;
		this.equipoList = new ArrayList<Equipo>();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDelegado() {
		return delegado;
	}
	public void setDelegado(String delegado) {
		this.delegado = delegado;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public List<Equipo> getEquipoList() {
		return equipoList;
	}
	public void setEquipoList(List<Equipo> equipoList) {
		this.equipoList = equipoList;
	
	}
	
	public void agregarEquipo(Equipo e)
    {
        this.equipoList.add(e);
        
    }
	
	@Override
	public String toString() {
		return "FichaInscripcion [id=" + id + ", delegado=" + delegado + ", dirección=" + dirección + ", celular="
				+ celular + ", equipoList=" + equipoList + "]";
	}
	
	
	

}
