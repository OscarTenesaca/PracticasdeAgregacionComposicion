
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Jugador j = new Jugador(1, "0302618251", "oscar", "tenesaca", "numero 6", "90.8");
				Equipo e= new Equipo(1, "carneros", "8 jugadores", "rojo");
				e.agregarJugador(j);
				
				FichaInscripcion fi=new FichaInscripcion(1, "oscar", "Azuay", "0995641727");
				fi.agregarEquipo(e);
				
				 System.out.println(fi.toString());

	}

}
