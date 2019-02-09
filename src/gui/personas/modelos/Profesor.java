/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import java.util.ArrayList;

/**
 *
 * @author Gianluca
 */
public class Profesor extends Persona {

private Cargo cargos;

    public Cargo getCargos() {
        return cargos;
    }

    public void setCargos(Cargo cargos) {
        this.cargos = cargos;
    }

    
    public Profesor(String apellidos, String nombre, int DNI,Cargo cargos) {
        
        super(apellidos,nombre,DNI);
        this.cargos = cargos;
    }

    


@Override
    public String toString() {
        super.mostrar();
        return " // Cargo: "+this.cargos+"\n"; //To change body of generated methods, choose Tools | Templates.
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + super.getDni();
        return hash;
    }

@Override
   public void mostrar(){
   super.mostrar();
   System.out.println("  // Cargo: "+this.cargos+"\n");
   
   }
    
    
    
}
