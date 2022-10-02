package model;

public class Empleado {

	
	String nombre;
	String codigo;
	String sueldo;
	
	
	public Empleado(String nombre, String codigo, String sueldo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.sueldo = sueldo;
	}
	

	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getSueldo() {
		return sueldo;
	}
	
	
}
