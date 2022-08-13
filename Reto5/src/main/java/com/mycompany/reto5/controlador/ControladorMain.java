//Clase principal 
package com.mycompany.reto5.controlador;

import com.mycompany.reto5.modelo.DAO.Conexion;
import com.mycompany.reto5.vista.frmPrincipal;
import java.sql.Connection;


public class ControladorMain {
    public static void main(String[] args) {
        
        new frmPrincipal().setVisible(true);

    }
}
