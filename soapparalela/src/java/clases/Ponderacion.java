package clases;

public class Ponderacion {
    double prioridad;
    // a, representa la diferencia entre el puntaje final que el alumno obtuvo
    // y el puntaje del ultimo alumno matriculado del año 2019,
    // mientras mayor sea su diferencia, mayor es su prioridad.
    double puntajefinal;
    // b, representa el puntaje final que el alumno obtuvo, utilizando
    // la funcion calculoponderacion.
    int carrera;
    // c, representa la posición del arreglo de carreras, es decir,
    // la ubicación de la carrera dentro de un arreglo (no debe repetirse)

    // Constructores necesarios
    public Ponderacion(double a, double b, int c) {
        prioridad = a; // Te dejo esto a ti
        puntajefinal = b; // Puntaje final obtenido de una carrera
        carrera = c;  // Posición del arreglo de carreras, lo cual puede ser de 0 a 27
    }
    public Ponderacion(Ponderacion x) {
        prioridad = x.getPrioridad();
        puntajefinal = x.getPuntajefinal();
        carrera = x.getCarrera();
    }
    // Getters necesarios
    public double getPrioridad () {
        return prioridad;
    }
    public double getPuntajefinal () {
        return puntajefinal;
    }
    public int getCarrera () {
        return carrera;
    }
    // Setters necesarios
    public void setPrioridad (double a) {
        prioridad = a;
    }
    public void setPuntajefinal (double b) {
        puntajefinal = b;
    }
    public void setCarrera (int c) {
        carrera = c;
    }
}

