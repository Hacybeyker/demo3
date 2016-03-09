<%-- 
    Document   : PaginaGestionarVision
    Created on : 17/02/2016, 05:23:15 PM
    Author     : <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="c3_dominio.entidades.Vision"%>
<%@page import="java.util.List"%>
<%@page import="c2_aplicacion.GestionarVisionServicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdvanceSoft - Gestionar Visión</title>
        <%@include file="../../../WEB-INF/jspf/cabezera.jspf" %>

    </head>    
    <body>
        <%
            GestionarVisionServicio gestionarVisionServicio = new GestionarVisionServicio();
            List<Vision> visiones = gestionarVisionServicio.buscar("");            
        %>        
        <h1>Gestionar Visión</h1>
        <br>
        <button type="button" class="glyphicon glyphicon-globe btn btn-primary btn-lg" onclick="window.location='NuevoVision'"></button>
        <a href="index.jsp"><button type="button" class="glyphicon glyphicon-arrow-left btn btn-warning btn-lg"></button></a>
            <br><br>
        <table class="table">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Imagen</th>
                    <th>Estado</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (Vision vision : visiones){
                %>
                    <tr>
                        <td><%= vision.getCodigo() %></td>
                        <td><%= vision.getNombre() %></td>
                        <td><%= vision.getDescripcion() %></td>
                        <td><img src="<%= vision.getImagen() %>" alt="Misión" title="Mision" width="50" height="50"/> </td>
                        <td><%= vision.getActivo() %></td>
                        <td><button type="button" class="glyphicon glyphicon-pencil btn btn-warning" onclick="window.location='EditarVision?codigovision=<%= vision.getCodigo() %>'"></button></td>
                        <td><button type="button" class="glyphicon glyphicon-trash btn btn-danger" onclick="funcionEliminar('EliminarVision',<%= vision.getCodigo() %>)"></button></td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <%@include file="../../../WEB-INF/jspf/piepagina.jspf" %>
    </body>
</html>
