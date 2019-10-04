import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	
	private int id; 
	private String nombre;  
	private String uniforme;
	private String color;
	private List <Jugador> jugadorList;
	
	
	public Equipo(int id, String nombre, String uniforme, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.uniforme = uniforme;
		this.color = color;
		this.jugadorList = new ArrayList<Jugador>();

		
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
	public String getUniforme() {
		return uniforme;
	}
	public void setUniforme(String uniforme) {
		this.uniforme = uniforme;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Jugador> getJugadorList() {
		return jugadorList;
	}
	public void setJugadorList(List<Jugador> jugadorList) {
		this.jugadorList = jugadorList;
	}
	
	
	public void agregarJugador(Jugador j)
    {
        this.jugadorList.add(j);
    }
	
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", uniforme=" + uniforme + ", color=" + color
				+ ", jugadorList=" + jugadorList + "]";
	}
	
	
	
	
	
	
	

}
