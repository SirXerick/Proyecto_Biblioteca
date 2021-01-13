/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Conectar {
    Connection conect = null;
    public Connection conexion()
    {
        //SQL SERVER: conect =DriverManager.getConnection("jbdc:sqlserver://servername\\SQLEXPRESS:1433;databaseName=Nombrebd;user=sa;password=contraseña;");

        try {  
            // Class.forName("com.mysql.jdbc.Driver");   
       conect = DriverManager.getConnection("jdbc:mysql://localhost/bd_Biblioteca","erick","erick09");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error en la conexion"+e);
        }
        return conect;

}}
