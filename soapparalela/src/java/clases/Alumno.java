package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Alumno {
    //Clase alumno   
    String rut; 
    // a, rut del alumno quien está ingresando la carrera
    ArrayList<Ponderacion> ponderaciones;
    // b, arreglo de tipo ponderacion del alumno,
    // siendo que, después de crearlo, debe estar ordenado de mayor a menor
    // según su prioridad.

    // Constructores necesarios
    public Alumno(String a, ArrayList<Ponderacion> b) {
        rut = a;
        ponderaciones = new ArrayList<>(b);

    }
    public Alumno(Alumno x) {
        rut = x.getRut();
        ponderaciones = new ArrayList<>(x.getPonderacionesfinales());
    }

    //Getters de variables de la misma clase
    public String getRut () {
        return rut;
    }
    public ArrayList<Ponderacion> getPonderacionesfinales () {
        return ponderaciones;
    }
    //Setters de variables de la misma clase
    public void setRut (String a) {
        rut = a;
    }
    public void setPonderacionesfinales (ArrayList<Ponderacion> b) {
        ponderaciones = new ArrayList<>(b);
    }
    public void agregarPonderacion(Ponderacion p){
        ponderaciones.add(p);
    }
    public void eliminarPonderacion(int posicion){
        ponderaciones.remove(posicion);
    }
    // Método que permite ordenar el arreglo de ponderaciones, de mayor a menor prioridad
    public void ordenarPonderaciones(){
        Collections.sort(ponderaciones, (Ponderacion a1, Ponderacion a2) -> new Double(a2.getPrioridad()).compareTo(a1.getPrioridad()));
    }
}
