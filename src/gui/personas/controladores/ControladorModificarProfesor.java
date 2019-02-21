/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.interfaces.IControladorModificarProfesor;
import gui.personas.modelos.Cargo;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaModificarProfesor;
import gui.personas.vistas.VentanaPersonaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

/**
 *
 * @author Gianpaolo
 */
public class ControladorModificarProfesor implements IControladorModificarProfesor{
    GestorPersonas GP= GestorPersonas.inicializar();
    
    @Override
    public void btnAceptarClic(ActionEvent evt) {
        this.VMDFP.dispose();
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        this.VMDFP.dispose();
    }

    @Override
    public void txtRazonPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fechaHastaPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
private static ControladorModificarProfesor CMP; 
private VentanaModificarProfesor VMDFP;
public void Anular(){
CMP=null;
}

private ControladorModificarProfesor (VentanaPersonaPrincipal VPP){
    
this.VMDFP=new VentanaModificarProfesor(this,VPP,true);
this.VMDFP.setLocationRelativeTo(null);
JComboBox Desplegable=this.VMDFP.getComboCargo();
Desplegable.setModel(new ModeloComboCargo());
((ModeloComboCargo)Desplegable.getModel()).SeleccionarCargo(Cargo.ADG);
this.VMDFP.setVisible(true);
}

public static ControladorModificarProfesor Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(CMP==null){
    CMP=new ControladorModificarProfesor(VentanaPadre);
            }

return CMP;
}
   
}
