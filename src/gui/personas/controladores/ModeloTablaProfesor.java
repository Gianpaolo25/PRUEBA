/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.GestorPersonas;
import gui.personas.modelos.Persona;
import java.util.ArrayList;
import java.util.List;
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
    }

    @Override
    public int getRowCount() {
    return this.GP.verUltimoProfesor();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        
        Persona UnProfesor = this.GP.dameProfesor(fila);
        switch (columna) {
            //No se muestra el cÃ³digo del establecimiento
            case 0: return UnProfesor.getNombre();
            case 1: return UnProfesor.getApellido();
            case 2: return UnProfesor.getDni();
            default: return UnProfesor.getNombre();
        }
    }
}
    
