package es.ercilla.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaController {
	@GetMapping("/alumnos")
	public String mostrarFormulatio() {
		return "formulario_alumno";
	}
}
