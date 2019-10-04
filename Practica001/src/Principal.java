
public class Principal {

	public static void main(String[] args) {
		//Persona per= new Persona(1, "0105761258", "diego", "palacios", "cuenca");
		
		Cargo cargo= new Cargo(1, "director", "dirigir");
		cargo.nuevaPersona(1, "0105761258", "diego", "palacios", "cuenca");
Pelicula pelicula= new Pelicula(1, "scary movie", "comedia");
pelicula.agregarCargo(cargo);

System.out.println(pelicula.toString());
	
		
		
	}

}
