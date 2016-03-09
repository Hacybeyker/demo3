/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.entidades.Vision;
import c4_persistencia.GestorJDBC;
import c4_persistencia.sqlserver.GestorJDBCSqlServer;
import c4_persistencia.sqlserver.VisioDAOSqlServer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public class GestionarVisionServicio {

    GestorJDBC gestorJDBC;
    VisioDAOSqlServer visioDAO;

    public GestionarVisionServicio() {
        gestorJDBC = new GestorJDBCSqlServer();
        visioDAO = new VisioDAOSqlServer(gestorJDBC);
    }
    
    public void crear(Vision vision) throws SQLException {
        try{
            gestorJDBC.abrirConexion();
            visioDAO.crear(vision);
            gestorJDBC.cerrarConexion();            
        }catch(Exception e){
            gestorJDBC.cerrarConexion();
        }
    }

    
    public void modificar(Vision vision) throws SQLException {        
        try{
            gestorJDBC.abrirConexion();
            visioDAO.modificar(vision);
            gestorJDBC.cerrarConexion();
        }catch(Exception ex){
            gestorJDBC.cerrarConexion();
        }
    }

    
    public void eliminar(Vision vision) throws Exception {
        try{
            gestorJDBC.abrirConexion();
            visioDAO.eliminar(vision);
            gestorJDBC.cerrarConexion();
        }catch(Exception ex){
            gestorJDBC.abrirConexion();
        }
    }

    
    public Vision buscar(int codigo) throws SQLException {
        Vision vision = new Vision();
        try{
            gestorJDBC.abrirConexion();
            vision = visioDAO.buscar(codigo);
            gestorJDBC.cerrarConexion();                    
        }catch(Exception ex){
            gestorJDBC.cerrarConexion();
        }
        return vision;
    }

    
    public List<Vision> buscar(String nombre) throws SQLException {
        List<Vision> visiones = new ArrayList();
        try{            
            gestorJDBC.abrirConexion();
            visiones = visioDAO.buscar("");
            gestorJDBC.cerrarConexion();
        }catch(Exception e){
            gestorJDBC.cerrarConexion();
        }
        return visiones;
    }
    
}
