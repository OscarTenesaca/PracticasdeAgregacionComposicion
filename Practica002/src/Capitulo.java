

public class Capitulo {
	
	private int id;
	private String numCapitulo;
	
	
	
	
	public Capitulo(int id, String numCapitulo) {
		this.id = id;
		this.numCapitulo = numCapitulo;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumCapitulo() {
		return numCapitulo;
	}
	public void setNumCapitulo(String numCapitulo) {
		this.numCapitulo = numCapitulo;
	}
	
	
	
	@Override
	public String toString() {
		return "Capitulo [id=" + id + ", numCapitulo=" + numCapitulo +  "]";
	}
	
	
	

}
