import java.util.ArrayList;
import java.util.List;

public class Platillo {

	private int id;
	private String nombre;
	private String tiempo;
	private String presentacion;
	private List<Receta> recetaList;

	public Platillo(int id, String nombre, String tiempo, String presentacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.presentacion = presentacion;
		this.recetaList = new ArrayList<Receta>();
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

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public List<Receta> getRecetaList() {
		return recetaList;
	}

	public void setRecetaList(List<Receta> recetaList) {
		this.recetaList = recetaList;
	}

	public void agregarReceta() {

	}

	@Override
	public String toString() {
		return "Platillo [id=" + id + ", nombre=" + nombre + ", tiempo=" + tiempo + ", presentacion=" + presentacion
				+ ", recetaList=" + recetaList + "]";
	}

}
