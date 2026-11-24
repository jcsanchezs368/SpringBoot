package es.ercilla.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.ercilla.spring.boot.models.Producto;
import es.ercilla.spring.boot.services.ProductoService;

@Controller
public class ProductoControlador {
	private final ProductoService servicio;
	
	public ProductoControlador(ProductoService servicio) {
		this.servicio = servicio;
	}
	// Muestra listado y formulario de alta en una sola JSP
	@GetMapping("/productos")
	public String listar(Model model) {
		model.addAttribute("productos", servicio.listar());
		model.addAttribute("producto", new Producto());
		model.addAttribute("titulo", "Nuevo producto");
		return "productos";
	}
}
