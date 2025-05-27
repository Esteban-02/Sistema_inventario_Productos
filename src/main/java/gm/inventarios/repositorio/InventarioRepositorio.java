package gm.inventarios.repositorio;

import gm.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepositorio extends JpaRepository<Producto, Integer> {
}
