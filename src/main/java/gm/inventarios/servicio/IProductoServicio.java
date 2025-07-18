package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {

    public List<Producto> listarProducto();
    public Producto buscarProducto(int idProducto);
    public Producto guardarProducto(Producto producto);
    public void eliminarProducto(Integer idProducto);
}
