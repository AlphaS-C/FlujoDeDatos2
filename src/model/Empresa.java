package model;

import java.util.ArrayList;

public class Empresa {

	
	String nombre;
	
	static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	
	


	public static String empleadosToString () {
		
		String empleados = "";
		if (listaEmpleados.size() == 0 || listaEmpleados == null) {
			return "No existen empleados";
		} else
			for (Empleado emp: listaEmpleados) {
				empleados += "Nombre: " + emp.getNombre() + " Codigo: " + emp.getCodigo()+ " Sueldo: " + emp.getSueldo() + "\n";
			}
		
		return empleados;
	}
	
	public static String productosToString () {
		
		String productos = "";
		if (listaProductos.size() == 0 || listaProductos == null) {
			return "No existen productos";
		} else
			for (Producto prod: listaProductos) {
				productos += "Nombre: " + prod.getNombre() + " Codigo: " + prod.getCodigo()+ " Precio: " + prod.getPrecio() + "\n";
			}
		
		return productos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}
	
}
