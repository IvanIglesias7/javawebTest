<%@ include file="/vistas/cabecera.jsp"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>EjemploWeb2</title>
</head>
<body>
	<h1>Este es la segunda pagina</h1>
	<p>Lista de Clientes:</p>

	<!-- 
	<p>
		Mensaje del controlador:
		<c:out value="${miModelo.mensaje}"></c:out>
	</p>
	<p>
		Mensaje del controlador2:
		<c:out value="${miModelo.mensaje2}"></c:out>
	</p>
	 -->


	<!-- Bucle para enseñar la lista de clientes del HashMap-->
	<table>
	
		<br>
		<tr>

			<th>Nombre</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<th>Numero de Telefono</th>
			<th>Direccion</th>

		</tr>
		<c:forEach var="cliente" items="${modeloClientes.listaClientes}">
		<tr>

			<td><c:out value="${cliente.nombre}"></c:out></td>
			<td><c:out value="${cliente.apellido}"></c:out></td>
			<td><c:out value="${cliente.apellido2}"></c:out></td>
			<td><c:out value="${cliente.numerotlf}"></c:out></td>
			<td><c:out value="${cliente.direccion}"></c:out></td>
		</tr>
	</c:forEach>
	</table>
	

	<a href="<c:url value="navegacionFormulario"/>">Ir al formulario</a>


</body>
</html>