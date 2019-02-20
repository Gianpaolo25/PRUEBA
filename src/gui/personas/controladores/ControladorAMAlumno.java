/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.interfaces.IControladorAMAlumno;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaAlumnoAM;
import gui.personas.vistas.VentanaPersonaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Gianpaolo
 */
public class ControladorAMAlumno implements IControladorAMAlumno{
GestorPersonas GP= GestorPersonas.inicializar();
         
    @Override
    public void btnGuardarClic(ActionEvent evt) {
    String Nombre= this.VAAM.getjTextField2().getText();
    String Apellido= this.VAAM.getjTextField1().getText();
    String cx=this.VAAM.getjTextField4().getText();
    int dni=Integer.parseInt(this.VAAM.getjTextField3().getText());
    GP.nuevoAlumno(Apellido, Nombre, dni, cx);
    this.VAAM.dispose();
        
    }
    public void btnCancelarClic(ActionEvent evt) {
        this.VAAM.dispose();
    }
    
    @Override
    public void txtApellidosPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtNombresPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtDocumentoPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtCXPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
private static ControladorAMAlumno CAMA;
private VentanaAlumnoAM VAAM;
public void Anular(){
CAMA=null;
}

private ControladorAMAlumno (VentanaPersonaPrincipal VPP){
    
this.VAAM=new VentanaAlumnoAM(this,VPP,true);
this.VAAM.setLocationRelativeTo(null);
this.VAAM.setVisible(true);
}

public static ControladorAMAlumno Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(CAMA==null){
    CAMA=new ControladorAMAlumno(VentanaPadre);
            }

return CAMA;
}
}
