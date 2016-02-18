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
public abstract class VisionAccion {
    public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);    
    public static VisionAccion instanciarAccion(String claseTipoAccion) {
        VisionAccion visionAccion;
        String nombreClaseAccion;
        try{
            nombreClaseAccion = "c1_presentacion.controlador.gestionarvision." + claseTipoAccion;
            visionAccion = (VisionAccion)Class.forName(nombreClaseAccion).newInstance();      
            return visionAccion;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }    
}
