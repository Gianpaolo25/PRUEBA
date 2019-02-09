

package gui.personas.controladores;
import gui.interfaces.IControladorPersonas;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaPersonaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gianpaolo
 */
public class ControladorPersonas implements IControladorPersonas {
    
    
    public GestorPersonas GP =GestorPersonas.inicializar();
    private static ControladorPersonas CP;
     private VentanaPersonaPrincipal VPP;
    public static ControladorPersonas Inicializar(){
    if(CP==null){CP=new ControladorPersonas();}
    return CP;
    }
    

    private ControladorPersonas() {
        VPP=new VentanaPersonaPrincipal(this);
        VPP.setVisible(true);
        VPP.setLocationRelativeTo(null);
    }
    
    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnNuevoAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnModificarProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnModificarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBorrarProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void btnVolverClic(ActionEvent evt) {
       this.VPP.dispose();
        
//        
    }

    @Override
    public void btnBuscarProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBuscarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ventanaGanaFoco(WindowEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtApellidosProfesorPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtApellidosAlumnoPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String ver(){return "Anda";}
}
