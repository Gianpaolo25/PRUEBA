/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.GestorPersonas;
import gui.personas.modelos.Profesor;
import gui.personas.vistas.VentanaPersonaPrincipal;
import gui.personas.vistas.VentanaProfesorBuscar;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Gianpaolo
 */
public class ControladorProfesorBuscar {
    
    GestorPersonas GP= GestorPersonas.inicializar();
    private static ControladorProfesorBuscar Crear; 
    private VentanaProfesorBuscar VPB;
public ArrayList <Profesor> ProfesoresBuscados=new ArrayList<>();
    private ControladorProfesorBuscar(VentanaPersonaPrincipal VentanaPadre) {
     this.VPB=new VentanaProfesorBuscar(this,VentanaPadre,true);
     this.VPB.setLocationRelativeTo(null);
     this.VPB.setVisible(true);
    }
    
    public void Anular(){
    Crear=null;
}
    public void btnAceptarClic(ActionEvent evt) {
        
        String apellido=this.VPB.getjTextField1().getText();
        this.ProfesoresBuscados=GP.buscarProfesores(apellido);
        this.VPB.dispose();
}
    
    public void btnCancelarClic(ActionEvent evt) {
        this.VPB.dispose();
        
}
    public static ControladorProfesorBuscar Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(Crear==null){
    Crear=new ControladorProfesorBuscar(VentanaPadre);
            }

return Crear;
}
}