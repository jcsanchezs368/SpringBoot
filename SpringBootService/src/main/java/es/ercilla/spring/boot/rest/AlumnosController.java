package es.ercilla.spring.boot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.ercilla.spring.boot.models.Alumno;
import es.ercilla.spring.boot.services.AlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
	private final AlumnoService servicio;
	
	@Autowired
	public AlumnosController(AlumnoService servicio) {
		this.servicio = servicio;
	}
	
	@PostMapping("/insertar")
	@ResponseStatus(HttpStatus.CREATED)
	public String insertar(@ModelAttribute Alumno alumno) {
		return "ALUMNO INSERTADO: " + servicio.insertar(alumno);
	}
	
	
}
