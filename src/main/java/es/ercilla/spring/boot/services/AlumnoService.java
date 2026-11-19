package es.ercilla.spring.boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.ercilla.spring.boot.models.Alumno;

@Service
public class AlumnoService {
	private List<Alumno> alumnos;
	private int idAlumno;
	public AlumnoService() {
		idAlumno = 1;
		alumnos = new ArrayList<Alumno>();
		insertar(new Alumno(idAlumno, "Juan Carlos", 21));
		insertar(new Alumno(idAlumno, "Iker", 19));
	}
	
	public synchronized Alumno insertar(Alumno alumno) {
		alumno.setIdAlumno(idAlumno);
		idAlumno++;
		alumnos.add(alumno);
		return alumno;
	}
}
