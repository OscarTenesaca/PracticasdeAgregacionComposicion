
public class Principal {

	public static void main(String[] args) {
		
		Proveedor p = new Proveedor(1, "juan", "palacios", "la favorita");
		Stock s= new Stock(1, "aceite", 10, 5);
		Producto produ= new Producto(1, "aceite", "doimestico");
		
		produ.agregarProveedor(p);
		produ.agregarStock(s);

	    System.out.println(produ.toString());


	}

}
