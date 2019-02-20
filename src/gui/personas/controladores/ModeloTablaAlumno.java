/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.Alumno;
import gui.personas.modelos.GestorPersonas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gianpaolo
 */
public class ModeloTablaAlumno extends AbstractTableModel{
     private List<String> nombresColumnas = new ArrayList<>(); 
     private GestorPersonas GP = GestorPersonas.inicializar();

    public ModeloTablaAlumno() {
        this.nombresColumnas.add("Nombre");
        this.nombresColumnas.add("Apellido");        
        this.nombresColumnas.add("DNI"); 
        this.nombresColumnas.add("CX");
    }

    @Override
    public Object getValueAt(int fila, int columna) {
       Alumno UnAlumno = this.ObtenerAlumno(fila);
        
        switch (columna) {
           
            case 0: return UnAlumno.getNombre();
            case 1: return UnAlumno.getApellido();
            case 2: return UnAlumno.getDni();
            case 3: return UnAlumno.getCx();
            default: return null;
        
        }
    }
    
    
    public Alumno ObtenerAlumno(int fila){
    return this.GP.MandarAlumno2(fila);
    }
    
    @Override
    public String getColumnName(int columna) {
        return this.nombresColumnas.get(columna);
    }
    
    @Override
    public int getRowCount() {
         return this.GP.verUltimoAlumno();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.size();
    }

    
    
}
