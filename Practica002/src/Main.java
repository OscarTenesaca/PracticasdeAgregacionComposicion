
public class Main {

	 public static void main(String[] args) {
	        // TODO code application logic here
		 
		 Capitulo c = new Capitulo(1,"Capitulo 1");
	     Libro l = new Libro(1,"Ingeniería de software"," Tecnologico"," Alfaomega",new java.util.Date(2005));

		 l.agregarCapitulo(c);
		 l.nuevoAutor(1, "oscar", "tenesaca", 22, "Ecuatoriano");     
	     l.nuevoAutor(2, "Rotman", "Zurita", 28, "Ecuatoriano");
	     l.nuevoAutor(3, "Diego", "Palacion", 25, "Ecuatoriano");
        
	        System.out.println(l.toString());
	       
	    }
	    
	}
