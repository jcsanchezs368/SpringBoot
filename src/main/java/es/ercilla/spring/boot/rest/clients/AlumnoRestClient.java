package es.ercilla.spring.boot.rest.clients;

import es.ercilla.spring.boot.models.Alumno;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;

public class AlumnoRestClient {
	private Client cliente;
	private final String URL_ALUMNOS = "http://localhost:8080/SpringBootService/alumnos"; 
	
	public AlumnoRestClient() {
		
		this.cliente = ClientBuilder.newClient();
	}
	
	public String insertar(Alumno alumno) {
		return cliente.target(URL_ALUMNOS)
		.path("/insertar")
		.request(MediaType.APPLICATION_JSON)
		.post(Entity.entity(alumno, MediaType.APPLICATION_JSON), String.class);
	}
}
