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
public class EditarVision extends VisionAccion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String paginaretorno = "GestionarVision";
        int codigovision = Integer.parseInt(request.getParameter("codigovision"));
        try{
            GestionarVisionServicio gestionarVisionServicio = new GestionarVisionServicio();
            Vision vision = gestionarVisionServicio.buscar(codigovision);
            if(vision!=null){
                paginaretorno = "c1_presentacion/vista/vision/PaginaEditarVision.jsp";
                request.setAttribute("vision", vision);
            }
        }catch(Exception ex){
            
        }
        return paginaretorno;
    }
    
}
