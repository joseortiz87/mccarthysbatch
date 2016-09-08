package mx.com.mccarthys.batch.model;

public class Comanda {
	private int idPuntoVenta;
	private long foliodet;
	private long movimiento;
	private int cantidad;
	private int idProducto;
	private float descuento;
	private float precio;
	private float impuesto;
	private java.util.Date hora;
	private String idestacion;
	private java.util.Date horaproduc;
	private int idmeseropr;
	public int getIdPuntoVenta() {
		return idPuntoVenta;
	}
	public void setIdPuntoVenta(int idPuntoVenta) {
		this.idPuntoVenta = idPuntoVenta;
	}
	public long getFoliodet() {
		return foliodet;
	}
	public void setFoliodet(long foliodet) {
		this.foliodet = foliodet;
	}
	public long getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(long movimiento) {
		this.movimiento = movimiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}
	public java.util.Date getHora() {
		return hora;
	}
	public void setHora(java.util.Date hora) {
		this.hora = hora;
	}
	public String getIdestacion() {
		return idestacion;
	}
	public void setIdestacion(String idestacion) {
		this.idestacion = idestacion;
	}
	public java.util.Date getHoraproduc() {
		return horaproduc;
	}
	public void setHoraproduc(java.util.Date horaproduc) {
		this.horaproduc = horaproduc;
	}
	public int getIdmeseropr() {
		return idmeseropr;
	}
	public void setIdmeseropr(int idmeseropr) {
		this.idmeseropr = idmeseropr;
	}
}
