package gm.inventarios.controlador;

import gm.inventarios.modelo.Producto;
import gm.inventarios.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventario-app")                       //navega por la URL: http://localhost:8080/inventario-app para realizar peticiones al Backend
@CrossOrigin(value = "http://localhost:4200")               // Puerto por defecto para conexion de Angular como Frontend
public class ProductoControlador {
    // atributo para el manejo de Loggin
    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class); // Con esto se envia informacion para el loggin de nuestra aplicacion

    @Autowired                                              //Inyeccion de  servicio dentro del controlador e inyectar el repositorio
    private ProductoServicio productoServicio;


    //Implementar los metodos
    @GetMapping("/productos")             //Recibe peticiones de tipo get a traves de la URL http://localhost:8080/inventario-app/productos
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.listarProducto();
        logger.info("Productos obtenidos: ");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

}
