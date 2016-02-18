/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.controlador;

import c1_presentacion.controlador.gestionarvision.VisionAccion;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public class GestionarVisionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlServlet = request.getServletPath();
        VisionAccion visionAccion = VisionAccion.instanciarAccion(urlServlet.substring(1));
        String url = visionAccion.ejecutar(request,response);
        RequestDispatcher despachador = request.getRequestDispatcher(url);
        despachador.forward(request, response);
    }
    
}