
package Metodos;

import clases.Carrera;


public class calcularponderacion {
    public double calculoponderacion(Carrera x, double ne, double ran, double mat, double len, double cie, double his) {
        double pn = x.getPnem(); // Se extrae porcentaje de nem de la carrera
        double pr = x.getPranking(); // Se extrae porcentaje de ranking de la carrera
        double pm = x.getPmatematica(); // Se extrae porcentaje de matematica de la carrera
        double pl = x.getPlenguaje(); // Se extrae porcentaje de lenguaje de la carrera
        double pciehis = x.getPcienciahistoria(); // Se extrae porcentaje de ciencia/historia
        // Ponderacion de cada uno, porcentaje*puntaje
        double n = pn * ne;
        double r = pr * ran;
        double m = pm * mat;
        double l = pl * len;
        double ch;
        if (cie > his) { // Se verifica si el puntaje de ciencia es mayor que el de historia
            ch = pciehis * cie;
        } else { // Por defecto, el puntaje de historia sea mayor
            ch = pciehis * his;
        }
        double ponderadofinal = n + r + m + l + ch; // Sumatoria de todas las ponderaciones de cada uno
        return ponderadofinal; // Ponderación final
    }
}
