package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;
import gm.inventarios.repositorio.InventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private InventarioRepositorio inventarioRepo;

    @Override
    public List<Producto> listarProducto() {
        return inventarioRepo.findAll();
    }

    @Override
    public Producto buscarProducto(int idProducto) {
        Producto producto = inventarioRepo.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public void guardarProducto(Producto producto) {
        inventarioRepo.save(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        inventarioRepo.delete(producto);

    }
}
