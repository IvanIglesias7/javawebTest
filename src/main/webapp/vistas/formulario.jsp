<%@ include file="/vistas/cabecera.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
  <title>Formulario</title>
  </head>
  <body>
    <h1>Nuevo Cliente</h1>
    <form:form method="POST" 
          action="guardarCliente" modelAttribute="clienteV">
             <table>
                <tr>
                    <td><form:label path="nombre">Nombre</form:label></td>
                    <td><form:input path="nombre"/></td>
                </tr>
                <tr>
                    <td><form:label path="apellido">Primer Apellido</form:label></td>
                    <td><form:input path="apellido"/></td>
                </tr>
                <tr>
                    <td><form:label path="apellido2">Segundo Apellido</form:label></td>
                    <td><form:input path="apellido2"/></td>
                </tr>
                <tr>
                    <td><form:label path="numerotlf">Numero de telefono</form:label></td>
                    <td><form:input path="numerotlf"/></td>
                </tr>
                <tr>
                    <td><form:label path="direccion">Direccion</form:label></td>
                    <td><form:input path="direccion"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </form:form> 
 </body>
</html>
