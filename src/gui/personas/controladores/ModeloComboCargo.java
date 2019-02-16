/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.controladores;

import gui.personas.modelos.Cargo;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Gianpaolo
 */
public class ModeloComboCargo extends DefaultComboBoxModel {

    public ModeloComboCargo() {
        for(Cargo c: Cargo.values()){
        this.addElement(c);}
    }

    public Cargo ObtenerCargo(){
    return (Cargo)this.getSelectedItem();}
    public void SeleccionarCargo(Cargo UnCargo){
    this.setSelectedItem(UnCargo);
    }
             
}
