package santi.inventarios.servicio;

import santi.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> ListarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public void guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
;}
