

package gui.personas.controladores;
import gui.interfaces.IControladorPersonas;
import gui.personas.modelos.Alumno;
import gui.personas.modelos.GestorPersonas;
import gui.personas.modelos.Persona;
import gui.personas.modelos.Profesor;
import gui.personas.vistas.VentanaPersonaPrincipal;
import gui.principal.vistas.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

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
    //private Profesor LUIS;
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
        VPP.setLocationRelativeTo(null);
        this.configurarTablaProfesor();
        this.configurarTablaAlumno();
         System.out.println(VPP.getProfesores());
         System.out.println(VPP.getAlumnos());
        VPP.setVisible(true);
        
    }
      
    public ControladorPersonas(VentanaPrincipal VP) {    
        this();
    }  
    
    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) {
        ControladorAMProfesor CAMP=ControladorAMProfesor.Inicializar(this.VPP);
        CAMP.Anular();
        GP.mostrarProfesores();  //mas adelante se lo borra        
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
//        int Option=JOptionPane.showOptionDialog(null,CONFIRMACION_PROFESOR,TITULO, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, this);
//    if(Option==JOptionPane.YES_OPTION){
//        GP.borrarProfesor(GP.dameProfesor(151515));
////        System.out.println(GP.borrarProfesor(LUIS));
////     GP.borrarProfesor(LUIS);
//     GP.mostrarProfesores1();
//    }  
        }
    
    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     int p=0;
     for(Alumno a: CAB.AlumnosBuscados ){
         p++;
         System.out.print(p+" ");
     System.out.println(a);}
        CAB.Anular();
    }
    
    
     @Override
    public void btnVolverClic(ActionEvent evt) {
       this.VPP.dispose();        
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
    
    
    
    
    
    private void configurarTablaProfesor() {
    JTable tablaProfesor= this.VPP.getProfesores();
    tablaProfesor.setModel(new ModeloTablaProfesor());
    tablaProfesor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//    ListSelectionListener lsl=(e)->{
//    if(!e.getValueIsAdjusting()){
//    int fila=tablaProfesor.getSelectedRow();
//    ModeloTablaProfesor mtp= (ModeloTablaProfesor)tablaProfesor.getModel();
//    Persona UnProfesor = mtp.ObtenerProfesor(fila);
//    //this.LUIS=((Profesor)UnProfesor);
//    
//    }
//    };
//    tablaProfesor.getSelectionModel().addListSelectionListener(lsl);
    }
    
    private void configurarTablaAlumno(){
    JTable tablaAlumno= this.VPP.getAlumnos();
    tablaAlumno.setModel(new ModeloTablaAlumno());
    tablaAlumno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//    ListSelectionListener lsl=(e)->{
//    if(!e.getValueIsAdjusting()){
//    int fila=tablaAlumno.getSelectedRow();
//    ModeloTablaAlumno mta= (ModeloTablaAlumno)tablaAlumno.getModel();
//    Persona UnAlumno = mta.ObtenerAlumno(fila);
//    //this.LUIS=((Alumno)UnAlumno);
//    
//    }
//    };
//    tablaAlumno.getSelectionModel().addListSelectionListener(lsl);
    }
        
}

