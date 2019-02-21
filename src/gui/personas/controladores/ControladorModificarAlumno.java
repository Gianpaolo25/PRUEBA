/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.interfaces.IControladorModificarAlumno;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaModificarAlumno;
import gui.personas.vistas.VentanaPersonaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Gianpaolo
 */
public class ControladorModificarAlumno implements IControladorModificarAlumno{
GestorPersonas GP= GestorPersonas.inicializar();
    
    
    @Override
    public void btnAceptarClic(ActionEvent evt) {
        this.VMA.dispose();
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
       this.VMA.dispose();
    }

    @Override
    public void txtRazonPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fechaHastaPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
private static ControladorModificarAlumno CMA;
private VentanaModificarAlumno VMA;

public void Anular(){
CMA=null;
}

private ControladorModificarAlumno (VentanaPersonaPrincipal VPP){
    
this.VMA=new VentanaModificarAlumno(this,VPP,true);
this.VMA.setLocationRelativeTo(null);
this.VMA.setVisible(true);
}

public static ControladorModificarAlumno Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(CMA==null){
    CMA=new ControladorModificarAlumno(VentanaPadre);
            }

return CMA;
}
}
