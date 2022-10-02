package controller;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Empleado;
import model.Empresa;
import model.Producto;
import persistencia.Persistencia;

public class ControladorMain {

	Empresa empresa = new Empresa();
	Persistencia persistencia = new Persistencia();
	
	
	
	@FXML TextField nEmpleado;
	@FXML TextField cEmpleado;
	@FXML TextField sEmpleado;
	@FXML Text feedback;
	public void createEmpleado() {
		
	if (nEmpleado.getText() != "" || cEmpleado.getText() != "" || sEmpleado.getText() != "") {
		empresa.getListaEmpleados().add(new Empleado(nEmpleado.getText(), cEmpleado.getText(), nEmpleado.getText()));
	}
	else feedback.setText("Por favor ingrese todos los valores");
	}
	
	@FXML TextField nProducto;
	@FXML TextField cProducto;
	@FXML TextField pPrecio;
	
	public void createProducto() {
		
	if (nProducto.getText() != "" || cProducto.getText() != "" || pPrecio.getText() != "") {
		empresa.getListaProductos().add(new Producto(nProducto.getText(), cProducto.getText(), pPrecio.getText()));
	}
	else feedback.setText("Por favor ingrese todos los valores");
	}
	
	
	public void saveEmpleado() {
		
		try {
			String empleados = Empresa.empleadosToString();
			persistencia.guardarEmpleados(empleados);
			feedback.setText("Empleados guardados."); 
		} catch (Exception e) {
			e.printStackTrace();
			feedback.setText("Algo salio mal hehe");
		}
	}
	
	public void saveProducto() {
		

		try {
			String productos = Empresa.productosToString();
			persistencia.guardarProductos(productos);
			feedback.setText("Productos guardados."); 
		} catch (Exception e) {
			e.printStackTrace();
			feedback.setText("Algo salio mal hehe");
		}
		
	}
	
}
