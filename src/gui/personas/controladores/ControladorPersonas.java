

package gui.personas.controladores;
import gui.interfaces.IControladorPersonas;
import gui.personas.modelos.Alumno;
import gui.personas.modelos.GestorPersonas;
import gui.personas.modelos.Profesor;
import gui.personas.vistas.VentanaPersonaPrincipal;
import gui.principal.vistas.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gianpaolo
 */
public class ControladorPersonas implements IControladorPersonas {
    
    
       
   public GestorPersonas GP =GestorPersonas.inicializar();
    private static ControladorPersonas CP;
    
    public static ControladorPersonas Inicializar(){ // para controladores y Gestores
    if(CP==null)
    {
       CP=new ControladorPersonas();
    }
    return CP;
    }
    
    
      private VentanaPersonaPrincipal VPP;           //para JFrame
    private ControladorPersonas() {
        VPP=new VentanaPersonaPrincipal(this);
        VPP.setVisible(true);
        VPP.setLocationRelativeTo(null);
    }
       
    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) {
        ControladorAMProfesor CAMP=ControladorAMProfesor.Inicializar(this.VPP);
        CAMP.Anular();
        GP.mostrarProfesores();  //mas adelante se lo borra    
    }
    
    
    public ControladorPersonas(VentanaPrincipal VP) {
        this();
    } 
     
    @Override
    public void btnNuevoAlumnoClic(ActionEvent evt) {
    ControladorAMAlumno CAMA=ControladorAMAlumno.Inicializar(this.VPP);
    CAMA.Anular();
    GP.mostrarAlumnos(); //mas adelante se lo borra
    }

    @Override
    public void btnModificarProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnModificarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBorrarProfesorClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void btnVolverClic(ActionEvent evt) {
       this.VPP.dispose();
        
//        
    }

    @Override
    public void btnBuscarProfesorClic(ActionEvent evt) {
        ControladorProfesorBuscar CPB=ControladorProfesorBuscar.Inicializar(VPP);
     int a=0;
     for(Profesor p: CPB.ProfesoresBuscados ){
         a++;
         System.out.print(a+" ");
     System.out.println(p);}
        CPB.Anular();
     
    }   
    @Override
    public void btnBuscarAlumnoClic(ActionEvent evt) {
    ControladorAlumnoBuscar CAB=ControladorAlumnoBuscar.Inicializar(VPP);
     int b=0;
//     for(Alumno a: CAB.AlumnosBuscados ){
//         b++;
//         System.out.print(b+" ");
//     System.out.println(a);
        CAB.Anular();
         
    }

    @Override
    public void ventanaGanaFoco(WindowEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtApellidosProfesorPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtApellidosAlumnoPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String ver(){return "Anda";}
}
