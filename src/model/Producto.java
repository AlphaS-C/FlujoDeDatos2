package model;

public class Producto {
	
	String nombre;
	String codigo;
	String precio;
	
	public Producto(String nombre, String codigo, String precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getPrecio() {
		return precio;
	}
	
	

	
	
}
