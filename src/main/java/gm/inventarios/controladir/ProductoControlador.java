package gm.inventarios.controladir;

import gm.inventarios.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inventario.app") //http://localhost:8080/inventario.app  -> todas las aplicaciones llevaran este nombre
@CrossOrigin(value = "http://localhost:4200") // Puerto por default de Angular  -> para poder realizar las peticiones hacia el backend
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);  // Envia la informacion hacia la consola del loggin

    @Autowired
    private ProductoServicio productoServicio;




}
