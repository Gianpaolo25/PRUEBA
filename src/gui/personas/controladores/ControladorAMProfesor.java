/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.interfaces.IControladorAMProfesor;
import gui.personas.modelos.Cargo;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaPersonaPrincipal;
import gui.personas.vistas.VentanaProfesorAM;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

/**
 *
 * @author Gianpaolo
 */
public class ControladorAMProfesor implements IControladorAMProfesor{

    GestorPersonas GP= GestorPersonas.inicializar();
    @Override
    public void btnGuardarClic(ActionEvent evt) {
    String Nombre= this.VPAM.getjTextField1().getText();
    String Apellido= this.VPAM.getjTextField2().getText();
    Cargo cargo= (Cargo)this.VPAM.getjComboBox2().getSelectedItem();
    int dni=Integer.parseInt(this.VPAM.getjTextField3().getText());
    GP.nuevoProfesor(Apellido, Nombre, dni, cargo);
    this.VPAM.dispose();
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

private static ControladorAMProfesor Crear; 
private VentanaProfesorAM VPAM;
public void Anular(){
Crear=null;
}
private ControladorAMProfesor (VentanaPersonaPrincipal VPP){
    
this.VPAM=new VentanaProfesorAM(this,VPP,true);
    
this.VPAM.setLocationRelativeTo(null);

JComboBox Desplegable=this.VPAM.getComboCargo();

Desplegable.setModel(new ModeloComboCargo());

((ModeloComboCargo)Desplegable.getModel()).SeleccionarCargo(Cargo.ADG);


this.VPAM.setVisible(true);
}

public static ControladorAMProfesor Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(Crear==null){
    Crear=new ControladorAMProfesor(VentanaPadre);
            }

return Crear;
}
}
