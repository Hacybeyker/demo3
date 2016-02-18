/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contratos;

import c3_dominio.entidades.Vision;
import java.util.List;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public interface IVision {
    public void crear (Vision vision);
    public void modificar (Vision vision);
    public void eliminar (Vision vision);
    public Vision buscar (int codigo);
    public List<Vision> buscar (String nombre);    
}
