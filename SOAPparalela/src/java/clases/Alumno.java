package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        ponderaciones = new ArrayList<Ponderacion>(b);
        //Collections.copy(ponderaciones, b);
        //                  copia,  origen
    }
    public Alumno(Alumno x) {
        rut = x.getRut();
        ponderaciones = new ArrayList<Ponderacion>(x.getPonderacionesfinales());
        //Collections.copy(ponderaciones, x.getPonderacionesfinales());
        //                   copia              origen     
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
        ponderaciones = new ArrayList<Ponderacion>(b);
        //Collections.copy(ponderaciones, b);
    }
    public void agregarPonderacion(Ponderacion p){
        ponderaciones.add(p);
    }
    public void eliminarPonderacion(int posicion){
        ponderaciones.remove(posicion);
    }
    // Método que permite ordenar el arreglo de ponderaciones, de mayor a menor prioridad
    public void ordenarPonderaciones(){
        Collections.sort(ponderaciones, new Comparator<Ponderacion>() {
			@Override
			public int compare(Ponderacion a1, Ponderacion a2) {
				return new Double(a2.getPrioridad()).compareTo(new Double(a1.getPrioridad()));
			}
		});
    }
}
