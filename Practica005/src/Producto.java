import java.util.ArrayList;
import java.util.List;

public class Producto {

	private int idProducto;
	private String nombre;
	private String tipo;
	private  List<Proveedor> proveedorList;
	private List<Stock> stockList;
	
	public Producto(int idProducto, String nombre, String tipo) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.proveedorList=new ArrayList<Proveedor>();
		this.stockList = new ArrayList<Stock>();

	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", tipo=" + tipo + ", proveedorList="
				+ proveedorList + ", stockList=" + stockList + "]";
	}


	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Stock> getStockList() {
		return stockList;
	}


	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}


	public List<Proveedor> getProveedorList() {
		return proveedorList;
	}
	public void setProveedorList(List<Proveedor> proveedorList) {
		this.proveedorList = proveedorList;
	}


	public void agregarProveedor(Proveedor p) {
	   
	   
	        this.proveedorList.add(p);
	   

		
	}
	public void agregarStock(Stock s) {
		   
		   
        this.stockList.add(s);
   

	
}
	
}
