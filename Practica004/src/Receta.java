import java.util.ArrayList;
import java.util.List;

public class Receta {

	private int id;
	private String clasificacion;
	private String origenReceta;
	private List<Ingrediente> ingredienteList;

	public Receta(int id, String clasificacion, String origenReceta) {
		super();
		this.id = id;
		this.clasificacion = clasificacion;
		this.origenReceta = origenReceta;
		this.ingredienteList = new ArrayList<Ingrediente>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getOrigenReceta() {
		return origenReceta;
	}

	public void setOrigenReceta(String origenReceta) {
		this.origenReceta = origenReceta;
	}

	public List<Ingrediente> getIngredienteList() {
		return ingredienteList;
	}

	public void setIngredienteList(List<Ingrediente> ingredienteList) {
		this.ingredienteList = ingredienteList;
	}

	public void nuevoIngrediente() {

	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", clasificacion=" + clasificacion + ", origenReceta=" + origenReceta
				+ ", ingredienteList=" + ingredienteList + "]";
	}

}
