package gm.inventarios;

import gm.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);

		// Prueba
		Producto producto = new Producto();
		producto.setDescripcion("Camisa M");
		producto.setPrecio(600.0);
		producto.setExistencias(50);

		//Imprimir objeto
		System.out.println(producto.toString());
	}

}
