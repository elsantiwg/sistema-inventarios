package santi.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import santi.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
