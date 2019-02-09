/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import java.util.Objects;

/**
 *
 * @author Flor & Miguel
 */
public class Alumno extends Persona{

    private String cx;

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }



    public Alumno(String nombres, String apellidos, int dni, String cx) {
        super(nombres,apellidos,dni);
        this.cx = cx;

    }
    
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" // Legajo: "+this.getCx()+"\n");
    }

    @Override
    public String toString() {
        this.mostrar();
        return ""; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.cx);
        return hash;
    }





    @Override
    public boolean equals(Object obj) {
        
        if(super.equals(obj))
        {
            return true;
                    }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }
    
     
    
    
}
