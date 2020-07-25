package Metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import clases.Alumno;

public class ordenar {

    public ordenar() {
    }
    
    public void ordenar(ArrayList<Alumno> A){ 
        Collections.sort(A, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                // Se compara solamente la prioridad de la primera posicion de ambos arreglos
                // Lo cual significa la carrera actual que se encuentra almacenado
                return new Double(a2.getPonderacionesfinales().get(0).getPuntajefinal()).compareTo(new Double(a1.getPonderacionesfinales().get(0).getPuntajefinal()));
            }
        });
    }
}
