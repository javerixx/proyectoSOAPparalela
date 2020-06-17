
package Metodos;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class archivo {

    public archivo() {
    }
    public static void leerPuntajesycodificar(String archivo) throws FileNotFoundException, IOException {
        String linea;
        FileReader f = new FileReader(archivo); //Para leer
        BufferedReader b = new BufferedReader(f); //El archivo que se ingresa
        FileWriter fichero = new FileWriter("base64codificado.txt"); //Se crea un archivo txt
        PrintWriter escribir = new PrintWriter(fichero); //Para proceder con escribir al nuevo archivo txt
        try{
            while((linea = b.readLine())!=null) { //rut;nem;ranking;matematica;lenguaje;ciencia;historia
                String codificado = Base64.getEncoder() //Se procede a codificar en base64
                    .encodeToString(linea.getBytes(StandardCharsets.UTF_8.name()));
                escribir.println(codificado); //Se escribe los datos codificados
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        try {
            //Asegurando de que los archivos estén cerrados
            if ((null != fichero) || (null != b) )
              fichero.close();
              b.close();
        } 
        catch (Exception e2) {
              e2.printStackTrace();
        }
    }
    public static void decodificaryleer(String archivo) throws FileNotFoundException, IOException {
        String linea, rut, decodificado;
        String[] datos;
        double nem, ranking, matematica, lenguaje, ciencia, historia;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        try{
            while((linea = b.readLine())!=null) { 
                byte[] dataBytes = Base64.getDecoder().decode(linea);
                decodificado = new String(dataBytes, StandardCharsets.UTF_8.name()); //Se decodifica en base64
                datos = decodificado.split(";");   // tipo string, datos = [rut, nem, ranking, matematica, lenguaje, ciencia, historia]
                rut = datos[0]; 
                nem = Double.parseDouble(datos[1]);
                ranking = Double.parseDouble(datos[2]);
                matematica = Double.parseDouble(datos[3]);
                lenguaje = Double.parseDouble(datos[4]);
                ciencia = Double.parseDouble(datos[5]);
                historia = Double.parseDouble(datos[6]);
                System.out.println("Rut: " + rut);
                System.out.println("Rut: " + nem);
                System.out.println("Ranking: " + ranking);
                System.out.println("Matematica: " + matematica);
                System.out.println("Lenguaje: " + lenguaje);
                System.out.println("Ciencia: " + ciencia);
                System.out.println("Historia: " + historia);
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        try {
            //Se asegura que el archivo codificado se cierre
            if (null != b)
              b.close();
        } 
        catch (Exception e2) {
              e2.printStackTrace();
        }
        b.close();
    }
}
