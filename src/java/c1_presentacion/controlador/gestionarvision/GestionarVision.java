/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.controlador.gestionarvision;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public class GestionarVision extends VisionAccion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        return "c1_presentacion/vista/vision/PaginaGestionarVision.jsp";
    }
    
}
