package persistencia;

import java.io.File;
import java.io.IOException;

public class Persistencia {

	ArchivoUtil util = new ArchivoUtil();
	
	
	
	public void guardarEmpleados (String empleados) {
		
		File file = new File("src/persistencia/empleados.txt");
		try {
			file.createNewFile();
			util.guardarArchivo("src/persistencia/empleados.txt", empleados, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void guardarProductos (String productos) {
		File file = new File("src/persistencia/productos.txt");
		try {
			file.createNewFile();
			util.guardarArchivo("src/persistencia/productos.txt", productos, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	
}
