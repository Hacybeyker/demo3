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

    
    public void modificar(Vision vision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void eliminar(Vision vision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Vision buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
