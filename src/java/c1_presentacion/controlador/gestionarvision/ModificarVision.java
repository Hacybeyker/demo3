/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.controlador.gestionarvision;

import c2_aplicacion.GestionarVisionServicio;
import c3_dominio.entidades.Vision;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hacybeyker
 */
public class ModificarVision extends VisionAccion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String paginaretorno = "GestionarVision";
        int codigo;
        String nombre,descripcion,imagen,activo;
        codigo = Integer.parseInt(request.getParameter("codigovision"));
        nombre = request.getParameter("nombre");
        descripcion = request.getParameter("descripcion");
        imagen = request.getParameter("imagen");
        activo = (request.getParameter("activo") == null) ? "off" : "on";
        try{
            if(!nombre.isEmpty() && !descripcion.isEmpty() && !imagen.isEmpty()){
                Vision vision = new Vision();
                vision.setCodigo(codigo);
                vision.setNombre(nombre);
                vision.setDescripcion(descripcion);
                vision.setImagen(imagen);
                vision.setActivo(activo);
                GestionarVisionServicio gestionarVisionServicio = new GestionarVisionServicio();
                gestionarVisionServicio.modificar(vision);
            }else{
                paginaretorno = "EditarVision";
                request.setAttribute("mensaje", "Llenar todos los campos");
            }
        }catch(Exception ex){
            request.setAttribute("mensaje", "Mesaje para Pagina Gestionar Vision");
        }
        return paginaretorno;
    }
}