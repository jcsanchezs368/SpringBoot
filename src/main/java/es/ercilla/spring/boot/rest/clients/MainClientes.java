package es.ercilla.spring.boot.rest.clients;

import es.ercilla.spring.boot.models.Alumno;

public class MainClientes {

	public static void main(String[] args) {
		AlumnoRestClient restClient = new AlumnoRestClient();
		
		System.out.println(restClient.insertar(new Alumno("Samuel Esteban", 20)));

	}
}
