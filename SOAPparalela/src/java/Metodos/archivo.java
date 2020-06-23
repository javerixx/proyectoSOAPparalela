
package Metodos;

import java.util.Base64;


public class archivo {

    public archivo() {
    }
    public static void leerdatos(String dato){
        String rut;
        String[] datos;
        String[] filas;
        double nem, ranking, matematica, lenguaje, ciencia, historia;
        filas =dato.split("\n");
        //int largofilas = filas.length;
        //System.out.println(filas + " filas  \n");
        for (int j =0; j< filas.length;j++){
            datos = filas[j].split(";");   // tipo string, datos = [rut, nem, ranking, matematica, lenguaje, ciencia, historia]
            rut = datos[0]; 
            nem = Double.parseDouble(datos[1]);
            ranking = Double.parseDouble(datos[2]);
            matematica = Double.parseDouble(datos[3]);
            lenguaje = Double.parseDouble(datos[4]);
            ciencia = Double.parseDouble(datos[5]);
            historia = Double.parseDouble(datos[6]);
            System.out.println("Rut: " + rut);
            System.out.println("Nem: " + nem);
            System.out.println("Ranking: " + ranking);
            System.out.println("Matematica: " + matematica);
            System.out.println("Lenguaje: " + lenguaje);
            System.out.println("Ciencia: " + ciencia);
            System.out.println("Historia: " + historia);
            if((matematica + lenguaje)/2<450){
                System.out.println("el puntaje no alcanza el minimo para postular");
            }
            System.out.println("-----------------------");

        }
    }

    public String leer(String datos){
        byte[] bytesdecodificado = Base64.getDecoder().decode(datos);
        String cadenadescadificada = new String(bytesdecodificado);
        leerdatos(cadenadescadificada);
        return "es return funcioa";
    }
}
