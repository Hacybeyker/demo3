/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.sqlserver;

import c4_persistencia.GestorJDBC;
import java.sql.DriverManager;

/**
 *
 * @author <Osorio Perez Carlos Alfredo advancesoft.trujillo@gmail.com>
 */
public class GestorJDBCSqlServer extends GestorJDBC{

    @Override
    public void abrirConexion() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conexion = DriverManager.getConnection("jdbc:sqlserver://yfbhz1zuj2.database.windows.net:1433;database=advancesoftdemo;user=Administrador@yfbhz1zuj2;password=Password*123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");        
    }
    
}
