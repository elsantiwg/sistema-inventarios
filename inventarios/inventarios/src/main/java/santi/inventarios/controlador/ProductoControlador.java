package santi.inventarios.controlador;


import jakarta.persistence.GeneratedValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import santi.inventarios.modelo.Producto;
import santi.inventarios.servicio.ProductoServicio;

import java.util.List;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin(value = "hyyp://localhost:4200")
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos")
    public List<Producto>obtenerProductos(){
        List<Producto> productos = this.productoServicio.ListarProductos();
        logger.info("productos obtenidos:");
        productos.forEach((producto -> logger.info(producto.toString())));
        return  productos;
    }
}
