<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar alumno</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/alumnos/insertar" action="POST">
		<label>Nombre</label>
		<input type="text" name="nombre">
		<label>Edad</label>
		<input type="number" min="1" step="1" name="edad">
		<input type="submit" value="ENVIAR">
		
	</form>
</body>
</html>