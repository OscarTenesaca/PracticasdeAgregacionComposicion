
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado = new Empleado(1, "Rotman", "Zurita", 370.00);
		Empleado empleado2 = new Empleado(2, "David", "Egas", 350.00);

		Departamento dtto = new Departamento(1, "Sistemas", "Cuenca");
		dtto.agregarEmleado(empleado);
		dtto.agregarEmleado(empleado2);

		Empresa empresa = new Empresa(1, "FranCel", "Galapagos", "francell@hotmail.com");
		empresa.agregarDepartameno(dtto);

		System.out.println(empresa.toString());

	}

}
