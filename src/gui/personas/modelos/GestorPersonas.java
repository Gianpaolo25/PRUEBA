/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import gui.interfaces.IGestorPersonas;
//import gui.interfaces.IGestorTrabajos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



/**
 *
 */


public class GestorPersonas implements IGestorPersonas {

    @Override
    public int ordenProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ordenAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
ArrayList <Profesor> Profesoress= new ArrayList <>();
ArrayList <Alumno> Alumnoss= new ArrayList<>();

public List<Profesor> CargarProfesor(){
    for(Persona p: personas){
        if(p instanceof Profesor ){
            if(!Profesoress.contains(p)){
        Profesoress.add(((Profesor)p));}
        }
     }
    return Profesoress;
}

public void CargarAlumno(){
    for(Persona p: personas){
        if(p instanceof Alumno ){
            if(!Alumnoss.contains(p)){
        Alumnoss.add(((Alumno)p));}
        }
     }
}

    @Override
    public int verUltimoProfesor() {
    this.CargarProfesor();
    for(Persona p: personas){
        if(p instanceof Profesor ){
            if(!Profesoress.contains(p)){
        Profesoress.add(((Profesor)p));}
        }
     }
    return Profesoress.size();
    }
public Profesor MandarProfesor2(int i){
   this.CargarProfesor();

   return this.CargarProfesor().get(i);}

public Alumno MandarAlumno2(int i){
//   this.CargarAlumno();

   return this.Alumnoss.get(i);}


    @Override
    public int verUltimoAlumno() {
        
        this.CargarAlumno();
    for(Persona p: personas){
        if(p instanceof Alumno ){
            if(!Alumnoss.contains(p)){
        Alumnoss.add(((Alumno)p));}
        }
     }
    return Alumnoss.size();
    }

    @Override
    public void cancelarProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ArrayList<Persona> personas =new ArrayList<>();
    ArrayList<Profesor> profesores= new ArrayList<>();
    ArrayList<Alumno> alumnos= new ArrayList<>();
    static GestorPersonas g;
    static String mensajeCorrecto="se agrego correctamente";
     static String mensajeIncorrecto="se creo pero no se agrego correctamente";
    static String mensajeErrorApellido="no se creo ya que el apellido esta mal";
    static String mensajeErrorNombre="no se creo ya que el nombre esta mal";
    static String mensajeErrorDNI="no se creo ya que el DNI esta mal";
    static String mensajeErrorCargo="no se creo ya que el cargo esta mal";
    static String mensajeErrorCx="no se creo ya que el cx esta mal";
     
    
    public static final String ARCHIVO = "./Archivo.txt";
    public static final char SEPARADOR = ',';
    public static final char DIVISION  = '-';
    public static final char PROFE   = '_';
    
    private GestorPersonas() {        
    this.leerArchivo();
    }
    public static GestorPersonas inicializar(){
    if(g== null)
    {
        g=new GestorPersonas();
    }
    return g;
    }
    
    @Override
    public String nuevoProfesor(String apellidos, String nombres, int dni, Cargo cargo){
        if(!ControlString(apellidos)){
            return mensajeErrorApellido;
        }
        if(!ControlString(nombres))   {
            return mensajeErrorNombre;
                                         }         
       if(dni<=0){
           return mensajeErrorDNI;
                 }
       if(cargo==null){
            return mensajeErrorCargo;
                      }
        Profesor profesor=new Profesor(apellidos,nombres,dni,cargo);
                            if(!personas.contains(profesor)){
                                System.out.println(profesor.getApellido());
                                personas.add(profesor);
                                this.escribirArchivo();
                                return mensajeCorrecto;
                                                            }
                            else return mensajeIncorrecto;

                   
    }
    
    private boolean ControlString (String cadena){
    if(cadena==null || cadena==""){
    return false;
    }
    else
        return true;
    }

    @Override
    public String nuevoAlumno(String apellidos, String nombres, int dni, String cx) {
        if(!ControlString(apellidos)){
            return mensajeErrorApellido;
        }
        if(!ControlString(nombres))   {
            return mensajeErrorNombre;
                                         }         
       if(dni<=0){
           return mensajeErrorDNI;
                 }
       if(!ControlString(cx)){
           return mensajeErrorCx;
                }
       Alumno alumno=new Alumno (apellidos,nombres,dni,cx);
       if(!personas.contains(alumno)){
                                personas.add(alumno);
                                this.escribirArchivo();
                                return mensajeCorrecto;
                                     }
                            else return mensajeIncorrecto;
    }

    @Override
    public ArrayList<Profesor> buscarProfesores(String apellidos) {
       ArrayList<Profesor> profesores=new ArrayList<>();
   
        for(Persona e: personas){
            if(e instanceof Profesor){
            if(e.getApellido().contains(apellidos)){
             profesores.add((Profesor)e);
            }
            }
       }
        return profesores;
    }


    @Override
    public ArrayList<Alumno> buscarAlumnos(String apellidos) {
       ArrayList<Alumno> alumnos=new ArrayList<>();
       alumnos=null;
        for(Persona e: personas){
            if(e instanceof Alumno){
            if(e.getApellido().indexOf(apellidos)!=-1){
             alumnos.add((Alumno)e);
            }
            }
       }
        return alumnos;
    
    }

    @Override
    public Profesor dameProfesor(int documento) {
        for(Persona e: personas){
        if(e instanceof Profesor){
        if(String.valueOf(e.getDni()).indexOf(String.valueOf(documento))!=-1){
            return (Profesor)e;
                                 }
        }
        }
        return null;
    }

    @Override
    public Alumno dameAlumno(String cx) {
        for(Persona e: personas){
        if(e instanceof Alumno){
       if(((Alumno) e).getCx().indexOf(cx)!=-1){
            return (Alumno)e;
                                 }
        }
        }
        return null;
    }


    public void mostrarPersonas() {
        for(Persona e: personas){
        e.mostrar();
        }
    }


    public void mostrarAlumnos() {
          for(Persona e: personas){
              if(e instanceof Alumno)
                //e.mostrar();
              System.out.println(e.getApellido());
        }  
    }

 
    public void mostrarProfesores() {
        for(Persona e: personas){
              if(e instanceof Profesor)
                //e.mostrar();
              System.out.println(((Profesor) e).getCargos());
       } 
//        for(Profesor e: profesores){
//                e.mostrar();
//       }
    }
 public void mostrarProfesores1() {
     for(Profesor e: this.Profesoress){
          
                e.mostrar();
        
    }
 }
    
    public void ordenar (){
    Comparator<Persona> cpo =(a1,a2)->{
        
        if(a1.getApellido().compareToIgnoreCase(a2.getApellido())!=0){
        return a1.getApellido().compareToIgnoreCase(a2.getApellido());
                                                           }
        
        return a1.getNombre().compareToIgnoreCase(a2.getNombre());
            };
    
    personas.sort(cpo);
    }

    @Override
    public String modificarProfesor(Profesor profesor, String apellidos, String nombres, Cargo cargo) {
       
        if(apellidos==null||apellidos==""){
        return "no se modifico el profesor por el apellido";
        }
        if(nombres==null || nombres==""){
        return "no se modifico el profesor por el nombre";
        }
        if(cargo==null){
        return "no se modifico el profesor por el cargo";
        }
            Profesor pro= new Profesor(apellidos,nombres,personas.get(personas.indexOf(profesor)).getDni(),cargo);
            personas.set(personas.indexOf(profesor),pro);
            this.escribirArchivo();
        return "se modifico el profesor";
    }

    @Override
    public String modificarAlumno(Alumno alumno, String apellidos, String nombres, String cx) {
        if(apellidos==null||apellidos==""){
        return "no se modifico el profesor por el apellido";
        }
        if(nombres==null || nombres==""){
        return "no se modifico el profesor por el nombre";
        }
        if(cx==null){
        return "no se modifico el profesor por el cargo";
        }
        personas.set(personas.indexOf(alumno),new Alumno(apellidos,nombres,personas.get(personas.indexOf(alumno)).getDni(),cx));
        this.escribirArchivo();
        return "se modifico el alumno";
    }
    
    
//    IGestorTrabajos traba=GestorTrabajos.inicializar();
ArrayList <Trabajo> UNTRABAJO =new ArrayList<>();

//    @Override
    public String borrarProfesor(Profesor profesor) { //MODIFICAR PARA MOSTRAR LO CORRECTO TENIENDO TRABAJO
//      for(Trabajo e: UNTRABAJO){
//          for(RolEnTrabajo r:e.getTodo())
//          if(r.getProfesor()==profesor){
//              return "no lo puede borrar";
//          }
//          }
        



      Profesoress.remove(profesor);
      System.out.println("-------------------------------");
      this.mostrarProfesores();
            System.out.println("-------------------------------");
     
      this.escribirArchivo();
      return "se borro con exito";
    }

//    @Override
    public String borrarAlumno(Alumno alumno) {  //MODIFICAR PARA MOSTRAR LO CORRECTO TENIENDO TRABAJO
//    for(Trabajo e: traba.mandarLista()){
//        for(AlumnoEnTrabajo r: e.getAlumnos()){
//        if(r.getAlumno()==alumno){
//            return "no se puede borrar";
//        }
//                                 }
//                                  }
//personas.remove(alumno);
//    this.escribirArchivo();
        return "se borro con exito";
    }
    /**anda*/
 public ArrayList<Persona> mandaLista (){
 return this.personas;
 
 }
 public ArrayList<Profesor> MandarListaProfesores (){
 return this.profesores;}
 
 
 
 private void leerArchivo() {
        BufferedReader br = null;
        File file = new File(ARCHIVO);
        if (file.exists()) {
            try {
                FileReader fr = new FileReader(file);
                br = new BufferedReader(fr);
                String cadena;// = null;
                while((cadena = br.readLine()) != null) {
                    String[] cadenadivicion = cadena.split(Character.toString(SEPARADOR));
                     String cadena1=String.valueOf(cadenadivicion[0]);
                     String[] vector= cadena1.split(Character.toString(DIVISION));
                      String nombre = vector[0];              
                      String apellido= vector[1];
                      String DNI=vector[2];
                      String cargoCX=vector[3];
                      
                     if(cargoCX.indexOf(PROFE)>-1){
                          cargoCX.substring(1);
                      Cargo cargo=Cargo.valueOf(cargoCX.substring(1));
                      System.out.println(cargo);
                    Profesor unaProfesor = new Profesor(apellido,nombre,Integer.valueOf(DNI),cargo);
                        this.personas.add(unaProfesor);
                                                 }
                      else{
                         
                      Alumno UnAlumno= new Alumno(nombre,apellido,Integer.valueOf(DNI),cargoCX);
                     System.out.println(UnAlumno.getApellido());
                      this.personas.add(UnAlumno);
                          }
                }
            }
            catch (IOException ioe) {
                System.out.println("Error al leer del archivo " + ARCHIVO);
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        }
    }
 
   private void escribirArchivo() {
        File file = new File(ARCHIVO);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {     
            for(Persona UnaPersona : this.personas) {
                String cadena;
                if(UnaPersona instanceof Profesor){
                 cadena = UnaPersona.getNombre() + DIVISION + UnaPersona.getApellido() + DIVISION + UnaPersona.getDni() + DIVISION + PROFE +((Profesor) UnaPersona).getCargos().name()+SEPARADOR;
                                                  }
                else{
                cadena = UnaPersona.getNombre()+ DIVISION+ UnaPersona.getApellido()+DIVISION+UnaPersona.getDni()+DIVISION+((Alumno)UnaPersona).getCx()+SEPARADOR;
                    }
                bw.write(cadena);
                bw.newLine();
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error al escribir en el archivo " + ARCHIVO);
        }
    } 
   

   
   
   
}
