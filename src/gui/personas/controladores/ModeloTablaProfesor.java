/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.GestorPersonas;
import gui.personas.modelos.Persona;
import gui.personas.modelos.Profesor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gianpaolo
 */
public class ModeloTablaProfesor extends AbstractTableModel{
     private List<String> nombresColumnas = new ArrayList<>(); 
     private GestorPersonas GP = GestorPersonas.inicializar();

    public ModeloTablaProfesor() {
        this.nombresColumnas.add("Nombre");
        this.nombresColumnas.add("Apellido");        
        this.nombresColumnas.add("DNI"); 
        this.nombresColumnas.add("Cargo");
        
    }
    int c=0;
    @Override
    public Object getValueAt(int fila, int columna) {
        
        Profesor UnProfesor = this.ObtenerProfesor(fila);
        c++;
        switch (columna) {
            //No se muestra el cÃ³digo del establecimiento
            case 0: return UnProfesor.getNombre();
            case 1: return UnProfesor.getApellido();
            case 2: return UnProfesor.getDni();
            case 3: return UnProfesor.getCargos();
            default: return UnProfesor.getNombre();
            
        }
    }
    
    public Profesor ObtenerProfesor(int fila){
    return this.GP.MandarProfesor2(fila);
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombresColumnas.get(columna);
    }

    @Override
    public int getRowCount() {
    return this.GP.verUltimoProfesor();
            
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.size();
    }

    
}
    
