/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

/**
 *
 * @author Flor & Miguel
 */
public abstract class Persona{
    private String Nombre;
    private String apellido;
    private int Dni;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Persona(String Nombre, String apellido, int Dni) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.Dni = Dni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.Dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.Dni != other.Dni) {
       
            return false;
        }
   
        return true;
    }    
    public void mostrar(){
    System.out.print("["+this.Dni+"]  "+this.apellido+", "+this.Nombre);
    }
    
    
   @Override
    public String toString() {
        this.mostrar();
        
        return ""; //To change body of generated methods, choose Tools | Templates.
        }

    
}


