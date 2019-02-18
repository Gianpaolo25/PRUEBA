/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.Alumno;
import gui.personas.modelos.GestorPersonas;
import gui.personas.vistas.VentanaAlumnoBuscar;
import gui.personas.vistas.VentanaPersonaPrincipal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Gianpaolo
 */
public class ControladorAlumnoBuscar {
    
GestorPersonas GP= GestorPersonas.inicializar();
private static ControladorAlumnoBuscar Crear; 
    private VentanaAlumnoBuscar VAB;
public ArrayList <Alumno> AlumnosBuscados=new ArrayList<>();
    private ControladorAlumnoBuscar(VentanaPersonaPrincipal VentanaPadre) {
     this.VAB=new VentanaAlumnoBuscar(this,VentanaPadre,true);
     this.VAB.setLocationRelativeTo(null);
     this.VAB.setVisible(true);
    }
    
    public void Anular(){
    Crear=null;
}
    public void btnAceptarClic(ActionEvent evt) {
        
        String cx=this.VAB.getjTextField1().getText();
        this.AlumnosBuscados=GP.buscarAlumnos(cx);
        this.VAB.dispose();
}
    
    public void btnCancelarClic(ActionEvent evt) {
        this.VAB.dispose();
        
}
    public static ControladorAlumnoBuscar Inicializar(VentanaPersonaPrincipal VentanaPadre){
if(Crear==null){
    Crear=new ControladorAlumnoBuscar(VentanaPadre);
            }

return Crear;
}
}
