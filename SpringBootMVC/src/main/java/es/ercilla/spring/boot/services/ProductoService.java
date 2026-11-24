package es.ercilla.spring.boot.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.ercilla.spring.boot.models.Producto;

public class ProductoService {
	private final List<Producto> productos = new ArrayList<Producto>();
	private long siguienteId = 3;
	
	public ProductoService() {
		productos.add(new Producto(1L, "Teclado", new BigDecimal("24.90"), 8));
		productos.add(new Producto(2L, "Ratón", new BigDecimal("12.50"), 15));
	}
	
	public synchronized List<Producto> listar() {
		return new ArrayList<Producto>(productos);
	}
	
	public synchronized Producto buscar(Long id) {
		for (Producto producto : productos) {
			if(producto.getId().equals(id)) {
				return new Producto(producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getStock());
			}
		}
		return null;
	}
	
	public synchronized void guardar(Producto producto) {
		if(producto.getId() == null) {
			Producto nuevo = new Producto(siguienteId++, producto.getNombre(), producto.getPrecio(), producto.getStock());
			productos.add(nuevo);
			return;
		}
		
		for (Producto actual : productos) {
			if(actual.getId().equals(producto.getId())) {
				actual.setNombre(producto.getNombre());
				actual.setPrecio(producto.getPrecio());
				actual.setStock(producto.getStock());
				return;
			}
		}
		throw new IllegalArgumentException("El producto no existe"); 
	}
	
	public synchronized void eliminar(Long id) {
		for(int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getId().equals(id)) {
				productos.remove(i);
				return;
			}
		}
	}
}
