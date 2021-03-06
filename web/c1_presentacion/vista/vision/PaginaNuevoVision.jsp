<%-- 
    Document   : PaginaNuevoVision
    Created on : 18/02/2016, 11:13:23 AM
    Author     : <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdvanceSoft - Nuevo Visión</title>
        <%@include file="../../../WEB-INF/jspf/cabezera.jspf" %>
    </head>
    <body>
        <h1>Nueva Visión</h1>
        <%
            String mensaje = (String)request.getAttribute("mensaje");
            if(mensaje!=null){
        %>
                <div class="alert alert-danger alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <strong>Porfavor, </strong><%= mensaje %>
                </div>
        <%
            }
        %>
        <form action="CrearVision" method="GET" name="FormNuevoVision">
            <div class="form-group">
                <label>Nombre:</label>
                <input type="text" id="nombre" name="nombre" class="form-control" placeholder="Nombre" maxlength="6" autofocus="autofocus" autocomplete="on" required="required"/>
            </div>
            <div class="form-group">
                <label>Descripción:</label>
                <textarea type="textarea" id="descripcion" name="descripcion" class="form-control" rows="3" placeholder="Descripcion" maxlength="1000" autocomplete="off" required="required"></textarea>
            </div>  
            <div class="form-group">
                <label>Imagen</label>
                <input type="text" id="imagen" name="imagen" class="form-control" placeholder="Imagen" maxlength="500" autocomplete="off" required="required"/>
            </div>
            <div class="form-group">
                <label>Activo</label><br>
                <input type="checkbox" id="activo" name="activo" class="form-control" checked data-toggle="toggle" data-size="mini">
                <!-- http://www.bootstraptoggle.com/ -->
            </div>
            <div class="form-group">
                <input class="btn btn-success btn-lg" type="submit" value="Registrar" />
                <input class="btn btn-danger btn-lg" type="button" onclick="window.location='GestionarVision'" value="Cancelar"/>
            </div>                
        </form>
        <%@include file="../../../WEB-INF/jspf/piepagina.jspf" %>
    </body>
</html>
