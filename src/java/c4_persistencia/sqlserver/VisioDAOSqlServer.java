/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.sqlserver;

import c3_dominio.contratos.IVision;
import c3_dominio.entidades.Vision;
import c4_persistencia.GestorJDBC;
import java.sql.PreparedStatement;
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
        String consulta = "insert into vision (nombrevision,descripcionvision,imagenvision,activovision) values (?,?,?,?)";
        try{
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, vision.getNombre());
            sentencia.setString(2, vision.getDescripcion());
            sentencia.setString(3, vision.getImagen());
            sentencia.setString(4, vision.getActivo());
            sentencia.executeQuery();            
        }catch(Exception e){
            
        }
    }

    @Override
    public void modificar(Vision vision) {
        String consulta = "update vision set nombrevision=?,descripcionvision=?,imagenvision=?,activovision=? where codigovision=" + vision.getCodigo();
        try{
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, vision.getNombre());
            sentencia.setString(2, vision.getDescripcion());
            sentencia.setString(3, vision.getImagen());
            sentencia.setString(4, vision.getActivo());
            sentencia.executeQuery();
        }catch(Exception ex){            
        }        
    }

    @Override
    public void eliminar(Vision vision) {
        String consulta = "delete from vision where codigovision = " + vision.getCodigo();
        try{
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.executeQuery();
        }catch(Exception ex){
            
        }
    }

    @Override
    public Vision buscar(int codigo) {
        String consulta = "select * from vision where codigovision = " + codigo;
        Vision vision = new Vision();
        try{
            ResultSet resultado = gestorJDBC.ejecutarConsulta(consulta);
            if(resultado.next()){
                vision.setCodigo(resultado.getInt(1));
                vision.setNombre(resultado.getString(2));
                vision.setDescripcion(resultado.getString(3));
                vision.setImagen(resultado.getString(4));
                vision.setActivo(resultado.getString(5));
            }
        }catch(Exception e){
            
        }
        return vision;
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
                vision.setActivo(resultado.getString(5));
                visiones.add(vision);
            }
        }catch(Exception e){
            
        }
        return visiones;
    }
    
}
