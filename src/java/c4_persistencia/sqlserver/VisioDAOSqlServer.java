/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.sqlserver;

import c3_dominio.contratos.IVision;
import c3_dominio.entidades.Vision;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public class VisioDAOSqlServer implements IVision{
    
    GestorJDBC gestorJDBC;

    public VisioDAOSqlServer(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }    

    @Override
    public void crear(Vision vision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Vision vision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Vision vision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vision buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vision> buscar(String nombre) {
        String consulta = "select * from vision";
        List<Vision> visiones = new ArrayList();
        try{
            ResultSet resultado = gestorJDBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                Vision vision = new Vision();
                vision.setCodigo(resultado.getInt(1));
                vision.setNombre(resultado.getString(2));
                vision.setDescripcion(resultado.getString(3));
                vision.setImagen(resultado.getString(4));
                vision.setActivo(String.valueOf((resultado.getInt(5))));
                visiones.add(vision);
            }
        }catch(Exception e){
            
        }
        return visiones;
    }
    
}
