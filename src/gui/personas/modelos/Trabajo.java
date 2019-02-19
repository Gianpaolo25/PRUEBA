/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * 
 */
public class Trabajo {
    
    private String titulo;
//    private ArrayList<Area> tematica;
    private int duracion;
    private LocalDate fechaPresentacion;
    private LocalDate fechaAprobacion;
    private LocalDate fechaExposicion;
//    private ArrayList<AlumnoEnTrabajo> alumnos= new ArrayList<>();
//    private ArrayList<Seminario> seminarios;
//    private ArrayList<RolEnTrabajo> todo;
//    GestorSeminarios gSeminario= GestorSeminarios.inicializar();
//   
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public int getDuracion() {
//        return duracion;
//    }
//
//    public void setDuracion(int duracion) {
//        this.duracion = duracion;
//    }
//
//    public LocalDate getFechaPresentacion() {
//        return fechaPresentacion;
//    }
//
//    public void setFechaPresentacion(LocalDate fechaPresentacion) {
//        this.fechaPresentacion = fechaPresentacion;
//    }
//
//    public LocalDate getFechaAprobacion() {
//        return fechaAprobacion;
//    }
//
//    public void setFechaAprobacion(LocalDate fechaAprobacion) {
//        this.fechaAprobacion = fechaAprobacion;
//    }
//
//    public LocalDate getFechaExposicion() {
//        return fechaExposicion;
//    }
//
//    public void setFechaExposicion(LocalDate fechaExposicion) {
//        this.fechaExposicion = fechaExposicion;
//    }
//
//    public List<Area> getTematica() {
//        return tematica;
//    }
//
//    public void setTematica(ArrayList<Area> tematica) {
//        this.tematica = tematica;
//    }
//
//    public List<AlumnoEnTrabajo> getAlumnos() {
//        return alumnos;
//    }
//
//    public void setAlumnos(ArrayList<AlumnoEnTrabajo> alumnos) {
//        this.alumnos = alumnos;
//    }
//
//    public List<Seminario> getSeminarios() {
//        return seminarios;
//    }
//
//    public void setSeminarios(ArrayList<Seminario> seminarios) {
//        this.seminarios = seminarios;
//    }
//
//    public ArrayList<RolEnTrabajo> getTodo() {
//        return todo;
//    }
//
//    public void setTodo(ArrayList<RolEnTrabajo> todo) {
//        this.todo = todo;
//    }
//
//    public Trabajo(String titulo, ArrayList<Area> tematica, int duracion, LocalDate fechaPresentacion, ArrayList<AlumnoEnTrabajo> alumnos, ArrayList<RolEnTrabajo> todo) {
//        this.titulo = titulo;
//        this.tematica = tematica;
//        this.duracion = duracion;
//        this.fechaPresentacion = fechaPresentacion;
//        this.alumnos = alumnos;
//        this.todo = todo;
////        this.seminarios=null;
//    }
//Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<Area> areas, ArrayList<RolEnTrabajo> profesores, ArrayList<AlumnoEnTrabajo> aet) {
//        
//        this(titulo,areas,duracion,fechaPresentacion,aet,profesores);
//       this.fechaAprobacion=fechaAprobacion;
//    }    
//    
//
//    
//    
//    public void mostrar(){
//        Rol x = Rol.COTUTOR;
//    System.out.println("Trabajo:"+this.titulo);
////    System.out.println("Duracion:"+this.duracion+" meses");
////    mostrarTematica();
////    System.out.println("Fecha Presentacion en CA: "+fechaPresentacion);
////    if(this.fechaAprobacion!=null)
////    {
////    System.out.println("Fecha de Aprobacion: "+fechaAprobacion+"\n\n");
////    }
////    else System.out.println("Fecha de Aprobacion: - \n\n"); System.out.println("\t\t   Alumnos\n--------------------------------------------------");
////    mostrarAlumnos(this.alumnos);
//////    if(fechaExposicion != null)
//////        {
//////    System.out.println("Fecha de Exposicion: "+fechaExposicion);
//////        }
//////    else 
//////    {System.out.println("Fecha de Exposicion: - ");}
//////        mostrarAlumnos(alumnos);
////
////        if(this.verificarTutor()){
////        System.out.println("\n\n\t\t   Tutor\n----------------------------------------------------");
////        for(RolEnTrabajo e: todo){
////            if(Rol.TUTOR == e.getRol())
////            {e.Mostrar();} 
////        }}
////        if(this.verificarCotutor()){
////System.out.println("\n\n\t\t   Cotutor\n----------------------------------------------------");
////        for(RolEnTrabajo e: todo){
////            if(Rol.COTUTOR == e.getRol())
////            {e.Mostrar();} 
////        }
////        }
////        if(this.verificarjurado())
////            {
////                System.out.println("\n\n\t\t   JURADO\n----------------------------------------------------");
////                for(RolEnTrabajo e: todo){
////                if(Rol.JURADO == e.getRol())
////                {   e.Mostrar();} 
////            }
////        }
////        if(this.seminarios!=null)
////        {
////            System.out.println("\n\n\t\t   Seminarios\n----------------------------------------------------");
////            mostrarSeminario();
////        }
////        
////        System.out.println("\n\n");
//
//    }
//
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    public void agregarTematica (Area tematica)
//    {
//           this.tematica.add(tematica);
//    }
//
//    public void mostrarTematica(){
//    for(Area e: tematica)
//        {
//           System.out.println(e);
//        }
//    }
//    public void mostrarSeminario(){
//    for(Seminario e: seminarios)
//        {
//           System.out.println(e);
//            
//    }
//    }
//
////public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion,ArrayList<Area> tematica,ArrayList<AlumnoEnTrabajo> alumnos) {
////        this.titulo = titulo;
////        this.duracion = duracion;
////        this.fechaPresentacion = fechaPresentacion;
////        this.fechaAprobacion = fechaAprobacion;
////        this.tematica=tematica;
////        this.alumnos=alumnos;
////        this.seminarios=null;
////    }
//        
//public void mostrarAlumnos (ArrayList<AlumnoEnTrabajo> alumnos)
//{
//    for (AlumnoEnTrabajo e: alumnos)
//    {
//    e.Mostrar();
//    }
//}
//
//public void agregarArea(Area nuevaArea)
//{
//    for(Area e : this.tematica)
//    {
//        if(e.getNombre() != nuevaArea.getNombre())
//        {
//           this.tematica.add(nuevaArea);
//        }
//        else
//        {
//        System.out.println(nuevaArea.getNombre()+" se repitio, por lo tanto no fue agregado");
//        }
//    }
//
//}
//
//public String agregarProfesor(RolEnTrabajo profesor)
//{
//    if(!todo.contains(profesor))
//    {
//       this.todo.add(profesor);
//       return "Se agrego correctamente";
//    }
//    else
//       return "No se pudo agregar";
//}
//
//public void agregarSeminario(Seminario seminario)
//{
//    if (this.seminarios==null)
//    {
//        ArrayList<Seminario> semina = new ArrayList <>();
//    this.seminarios=semina;
//    this.seminarios.add(seminario);
//       System.out.println("se agrego el seminario");
//    }
//    else {if(!seminarios.contains(seminario))
//    {
//       this.seminarios.add(seminario);
//       System.out.println("se agrego el seminario");
//    }
//    else
//       System.out.println("no se agrego el seminario");
//    }
//}
//
//public void ordenarSeminario(){
//  Comparator <Seminario> comp=(s1,s2)->{
//       s1.getFechaExposicion().compareTo(s2.getFechaExposicion());
//      return s1.getFechaExposicion().compareTo(s2.getFechaExposicion());
//                            };
//    this.seminarios.sort(comp);
//}
//
//public void AgregarRolEnTrabajo (RolEnTrabajo capo)
//{
//    int x =0;
//    for(RolEnTrabajo e : todo)
//    {
//        if(e.agregarProfesor(capo.getProfesor()))
//        {
//        x=1;        
//        }
//   
//    }          
//    if (x==1)
//    {
//        System.out.println("Se repitio el ingresado");
//    }
//    else
//        this.todo.add(capo);
//}
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 89 * hash + Objects.hashCode(this.titulo);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Trabajo other = (Trabajo) obj;
//        if (!Objects.equals(this.titulo, other.titulo)) {
//            return false;
//        }
//        return true;
//    }
//
//    public Trabajo(String titulo, ArrayList<Area> tematica, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<AlumnoEnTrabajo> alumnos, ArrayList<Seminario> seminarios, ArrayList<RolEnTrabajo> todo) {
//        this.titulo = titulo;
//        this.tematica = tematica;
//        this.duracion = duracion;
//        this.fechaPresentacion = fechaPresentacion;
//        this.fechaAprobacion = fechaAprobacion;
//        this.alumnos = alumnos;
//        this.seminarios = seminarios;
//        this.todo = todo;
//    }
//
//    public boolean verificarjurado ()
//    {
//        for(RolEnTrabajo e :this.todo)
//        {
//        if(e.getRol()==Rol.JURADO)
//        {
//        return true;
//        }
//        }
//    return false;
//    }
//    public boolean verificarTutor ()
//    {
//        for(RolEnTrabajo e :this.todo)
//        {
//        if(e.getRol()==Rol.TUTOR)
//        {
//        return true;
//        }
//        }
//    return false;
//    }
//    public boolean verificarCotutor ()
//    {
//        for(RolEnTrabajo e :this.todo)
//        {
//        if(e.getRol()==Rol.COTUTOR)
//        {
//        return true;
//        }
//        }
//    return false;
//    }
//    
//    public String nuevoSeminario(LocalDate fechaExposicion,NotaAprobacion nota, String observaciones){
//    
//        if (this.gSeminario.validarSeminario(fechaExposicion, nota, titulo)=="no se creo el seminario"){
//        return "la fecha de Exposicion esta mal";
//                                                                                                       }
//        if(!fechaExposicion.isAfter(this.fechaAprobacion)){
//        return "fecha de exposicion no es despues de aprobacion";
//        }
//        Seminario seminario=new Seminario(fechaExposicion,nota,observaciones);
//        this.agregarSeminario(seminario);
//        return "";
//                                                                                                     }
//
//public String modificarSeminario(Seminario seminario,NotaAprobacion notaAprobacion,String observaciones){
//if(seminario==null ){
//                    return "el seminario es nulo, no se puede modificar";
//                   }
//if(notaAprobacion !=NotaAprobacion.APROBADO_CONOBS &&notaAprobacion !=NotaAprobacion.APROBADO_SINOBS&&notaAprobacion !=NotaAprobacion.DESAPROBADO){
//return "la nota no es valida";
//                                                                                                                                                  }
//int i=seminarios.indexOf(seminario);
//Seminario s=new Seminario(seminarios.get(i).getFechaExposicion(),notaAprobacion,observaciones);                                                   
//seminarios.set(seminarios.indexOf(seminario),s);
//return "anda";
//                                                                                                        }

}

