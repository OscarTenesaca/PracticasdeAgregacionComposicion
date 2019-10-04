
public class Stock {

	private int idStock;
	private String descripcion;
	private float cantidad;
	private float cantidadMinima;
	public int getIdStock() {
		return idStock;
	}
	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", cantidadMinima=" + cantidadMinima + "]";
	}
	public Stock(int idStock, String descripcion, float cantidad, float cantidadMinima) {
		super();
		this.idStock = idStock;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.cantidadMinima = cantidadMinima;
	}
	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public float getCantidadMinima() {
		return cantidadMinima;
	}
	public void setCantidadMinima(float cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}
	
}
