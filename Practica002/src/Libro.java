import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Libro {
	
	private int id;
	private String titulo;
	private String tipo;
	private String editorial;
	private Date anio;
	private List<Autor> autorList;
	private List<Capitulo> capituloList;
	
	
	public Libro(int id, String titulo, String tipo, String editorial, Date anio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tipo = tipo;
		this.editorial = editorial;
		this.anio = anio;
		this.autorList= new ArrayList<Autor>();
		this.capituloList = new ArrayList<Capitulo>();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	public List<Autor> getAutorList() {
		return autorList;
	}
	public void setAutorList(List<Autor> autorList) {
		this.autorList = autorList;
	}
	public List<Capitulo> getCapituloList() {
		return capituloList;
	}
	public void setCapituloList(List<Capitulo> capituloList) {
		this.capituloList = capituloList;
	}


	
	  public void nuevoAutor(int c, String n, String a, int e, String nac)
	    {
	        this.autorList.add(new Autor(c,n,a,e,nac));
	    }
	  
	  
	  public void agregarCapitulo(Capitulo l)
	    {
	        this.capituloList.add(l);
	    }
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", anio="
				+ anio + ", autorList=" + autorList + ", capituloList=" + capituloList + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Libro(int id, String titulo, String tipo, String editorial, Date anio) {
//		
//		this.id = id;
//		this.titulo = titulo;
//		this.tipo = tipo;
//		this.editorial = editorial;
//		this.anio = anio;
//		this.autorList= new ArrayList<Autor>();
//		this.capituloList = new ArrayList<Capitulo>();
//		
//	}
//	  
//	  
//	int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getTitulo() {
//		return titulo;
//	}
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//	public String getTipo() {
//		return tipo;
//	}
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//	public String getEditorial() {
//		return editorial;
//	}
//	public void setEditorial(String editorial) {
//		this.editorial = editorial;
//	}
//	public Date getAnio() {
//		return anio;
//	}
//	public void setAnio(Date anio) {
//		this.anio = anio;
//	}
//	public List<Autor> getAutorList() {
//		return autorList;
//	}
//	public void setAutorList(List<Autor> autorList) {
//		this.autorList = autorList;
//	}
//	
//	
//	  public void nuevoAutor(int c, String n, String a, int e, String nac)
//	    {
//	        this.autorList.add(new Autor(c,n,a,e,nac));
//	    }
//	  
//	  
//	  public void agregarCapitulo(Capitulo l)
//	    {
//	        this.capituloList.add(l);
//	    }
//	
//
//
//	@Override
//	public String toString() {
//		return "Libro [id=" + id + ", titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", anio="
//				+ anio + ", autorList=" + autorList + "]";
//	}
//	
//	
//	

}
