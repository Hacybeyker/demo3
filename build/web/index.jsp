<%-- 
    Document   : index
    Created on : 17/02/2016, 05:14:16 PM
    Author     : <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
--%>

<%@page import="c3_dominio.entidades.Vision"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
        <%@include file="WEB-INF/jspf/cabezera.jspf" %>
    </head>
    <body>
        <h1>Index</h1>
        <p>Página</p>
        <a href="GestionarVision">Vision</a>
        <%@include file="WEB-INF/jspf/piepagina.jspf" %>
    </body>
</html>
