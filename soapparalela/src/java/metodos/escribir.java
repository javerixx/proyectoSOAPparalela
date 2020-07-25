package metodos;

import clases.Alumno;
import clases.Carrera;
import clases.Ponderacion;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class escribir {
    Carrera arreglocarrera [] = new Carrera[28];
    ArrayList<Alumno> a1 = new ArrayList<>();
    ArrayList<Alumno> a2 = new ArrayList<>();
    ArrayList<Alumno> a3 = new ArrayList<>();
    ArrayList<Alumno> a4 = new ArrayList<>();
    ArrayList<Alumno> a5 = new ArrayList<>();
    ArrayList<Alumno> a6 = new ArrayList<>();
    ArrayList<Alumno> a7 = new ArrayList<>();
    ArrayList<Alumno> a8 = new ArrayList<>();
    ArrayList<Alumno> a9 = new ArrayList<>();
    ArrayList<Alumno> a10 = new ArrayList<>();
    ArrayList<Alumno> a11= new ArrayList<>();
    ArrayList<Alumno> a12 = new ArrayList<>();
    ArrayList<Alumno> a13 = new ArrayList<>();
    ArrayList<Alumno> a14 = new ArrayList<>();
    ArrayList<Alumno> a15 = new ArrayList<>();
    ArrayList<Alumno> a16 = new ArrayList<>();
    ArrayList<Alumno> a17 = new ArrayList<>();
    ArrayList<Alumno> a18 = new ArrayList<>();
    ArrayList<Alumno> a19 = new ArrayList<>();
    ArrayList<Alumno> a20 = new ArrayList<>();
    ArrayList<Alumno> a21 = new ArrayList<>();
    ArrayList<Alumno> a22 = new ArrayList<>();
    ArrayList<Alumno> a23 = new ArrayList<>();
    ArrayList<Alumno> a24 = new ArrayList<>();
    ArrayList<Alumno> a25 = new ArrayList<>();
    ArrayList<Alumno> a26 = new ArrayList<>();
    ArrayList<Alumno> a27 = new ArrayList<>();
    ArrayList<Alumno> a28 = new ArrayList<>();
    int var1=0, var2=0, var3=0, var4=0, var5=0, var6=0, var7=0, var8=0, var9=0, var10=0, var11=0, var12=0, var13=0, var14=0, var15=0, var16=0, var17=0, var18=0, var19=0, var20=0, var21=0, var22=0, var23=0, var24=0, var25=0, var26=0, var27=0, var28=0;
    

    public Carrera[] datoscarreras() { // Funcion que retorna el arreglo de clase carrera definidos por la UTEM
        //Agregando todas las carreras al iniciar la ejecución del servidor
        /*Carrera c1 = new Carrera(21089, "Administracion Publica", 0.15, 0.2, 0.3, 0.25, 0.1, 450, 0, 35, 625.8, 513);
        arreglocarrera[0] = c1;
        Carrera c2 = new Carrera(21002, "Bibliotecologia y Documentacion", 0.2, 0.2, 0.4, 0.1, 0.1, 450, 0, 35, 675.3, 453.6);
        arreglocarrera[1] = c2;
        Carrera c3 = new Carrera(21012, "Contador Publico y Auditor", 0.2, 0.2, 0.3, 0.15, 0.15, 450, 0, 80, 635.55, 452.2);
        arreglocarrera[2] = c3;
        Carrera c4 = new Carrera(21048, "Ingenieria Comercial", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 125, 652.9, 496.9);
        arreglocarrera[3] = c4;
        Carrera c5 = new Carrera(21015, "Ingenieria en Administracion Agroindustrial", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 30, 628.8, 461.8);
        arreglocarrera[4] = c5;
        Carrera c6 = new Carrera(21081, "Ingenieria en Comercio Internacional", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 90, 637.2, 458.8);
        arreglocarrera[5] = c6;
        Carrera c7 = new Carrera(21082, "Ingenieria en Gestion Turistica", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 25, 659.4, 448.1);
        arreglocarrera[6] = c7;
        Carrera c8 = new Carrera(21047, "Arquitectura", 0.15, 0.25, 0.2, 0.2, 0.2, 450, 0, 100, 640.2, 527.4);
        arreglocarrera[7] = c8;
        Carrera c9 = new Carrera(21074, "Ingenieria Civil en Obras Civiles", 0.2, 0.2, 0.15, 0.35, 0.1, 450, 0, 100, 625, 476.1);
        arreglocarrera[8] = c9;
        Carrera c10 = new Carrera(21032, "Ingenieria en Construccion", 0.2, 0.2, 0.15, 0.35, 0.1, 450, 0, 100, 716.3, 476.95);
        arreglocarrera[9] = c10;
        Carrera c11 = new Carrera(21087, "Ingenieria Civil en Prevencion de Riesgos y Medioambiente", 0.15, 0.35, 0.2, 0.2, 0.1, 450, 0, 30, 615.2, 462.85);
        arreglocarrera[10] = c11;
        Carrera c12 = new Carrera(21073, "Ingenieria en Biotecnologia", 0.15, 0.25, 0.2, 0.3, 0.1, 450, 0, 60, 675.8, 540.9);
        arreglocarrera[11] = c12;
        Carrera c13 = new Carrera(21039, "Ingenieria en Industria Alimentaria", 0.15, 0.25, 0.2, 0.3, 0.1, 450, 0, 30, 680.2, 464.9);
        arreglocarrera[12] = c13;
        Carrera c14 = new Carrera(21080, "Ingenieria en Quimica", 0.1, 0.25, 0.15, 0.3, 0.2, 450, 0, 80, 606.55, 451.7);
        arreglocarrera[13] = c14;
        Carrera c15 = new Carrera(21083, "Quimica Industrial", 0.1, 0.25, 0.15, 0.3, 0.2, 450, 0, 40, 596.05, 472);
        arreglocarrera[14] = c15;
        Carrera c16 = new Carrera(21024, "Diseño en Comunicacion Visual", 0.1, 0.4, 0.3, 0.1, 0.1, 450, 0, 100, 706.3, 440.2);
        arreglocarrera[15] = c16;
        Carrera c17 = new Carrera(21023, "Diseño Industrial", 0.1, 0.4, 0.3, 0.1, 0.1, 450, 0, 65, 642.2, 439.9);
        arreglocarrera[16] = c17;
        Carrera c18 = new Carrera(21043, "Trabajo Social", 0.2, 0.3, 0.2, 0.1, 0.2, 450, 0, 95, 705.9, 510.5);
        arreglocarrera[17] = c18;
        Carrera c19 = new Carrera(21046, "Bachillerato en Ciencias de la Ingenieria", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 25, 586.45, 504.25);
        arreglocarrera[18] = c19;
        Carrera c20 = new Carrera(21071, "Dibujante Proyectista", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 25, 689.85, 496.45);
        arreglocarrera[19] = c20;
        Carrera c21 = new Carrera(21041, "Ingenieria Civil en Computacion, mencion Informatica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 130, 673.65, 539.35);
        arreglocarrera[20] = c21;
        Carrera c22 = new Carrera(21076, "Ingenieria Civil Industrial", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 200, 671.25, 500.85);
        arreglocarrera[21] = c22;
        Carrera c23 = new Carrera(21049, "Ingenieria Civil en Ciencia de Datos", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 673.65, 539.35);
        arreglocarrera[22] = c23;
        Carrera c24 = new Carrera(21075, "Ingenieria Civil Electronica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 80, 657.35, 500.65);
        arreglocarrera[23] = c24;
        Carrera c25 = new Carrera(21096, "Ingenieria Civil en Mecanica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 90, 697.65, 506.8);
        arreglocarrera[24] = c25;
        Carrera c26 = new Carrera(21031, "Ingenieria en Geomensura", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 614.3, 487.85);
        arreglocarrera[25] = c26;
        Carrera c27 = new Carrera(21030, "Ingenieria en Informatica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 105, 705.15, 507.75);
        arreglocarrera[26] = c27;
        Carrera c28 = new Carrera(21045, "Ingenieria Industrial", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 584.75, 476.25);
        arreglocarrera[27] = c28;*/
        //orden lugar tentativo
        Carrera c1 = new Carrera(21076, "Ingenieria Civil Industrial", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 200, 671.25, 500.85);
        arreglocarrera[0] = c1;
        Carrera c2 = new Carrera(21041, "Ingenieria Civil en Computacion, mencion Informatica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 130, 673.65, 539.35);
        arreglocarrera[1] = c2;
        Carrera c3 = new Carrera(21047, "Arquitectura", 0.15, 0.25, 0.2, 0.2, 0.2, 450, 0, 100, 640.2, 527.4);
        arreglocarrera[2] = c3;
        Carrera c4 = new Carrera(21048, "Ingenieria Comercial", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 125, 652.9, 496.9);
        arreglocarrera[3] = c4;
        Carrera c5 = new Carrera(21074, "Ingenieria Civil en Obras Civiles", 0.2, 0.2, 0.15, 0.35, 0.1, 450, 0, 100, 625, 476.1);
        arreglocarrera[4] = c5;
        Carrera c6 = new Carrera(21045, "Ingenieria Industrial", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 584.75, 476.25);
        arreglocarrera[5] = c6;
        Carrera c7 = new Carrera(21030, "Ingenieria en Informatica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 105, 705.15, 507.75);
        arreglocarrera[6] = c7;
        Carrera c8 = new Carrera(21080, "Ingenieria en Quimica", 0.1, 0.25, 0.15, 0.3, 0.2, 450, 0, 80, 606.55, 451.7);
        arreglocarrera[7] = c8;
        Carrera c9 = new Carrera(21075, "Ingenieria Civil Electronica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 80, 657.35, 500.65);
        arreglocarrera[8] = c9;
        Carrera c10 = new Carrera(21081, "Ingenieria en Comercio Internacional", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 90, 637.2, 458.8);
        arreglocarrera[9] = c10;
        Carrera c11 = new Carrera(21043, "Trabajo Social", 0.2, 0.3, 0.2, 0.1, 0.2, 450, 0, 95, 705.9, 510.5);
        arreglocarrera[10] = c11;
        Carrera c12 = new Carrera(21031, "Ingenieria en Geomensura", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 614.3, 487.85);
        arreglocarrera[11] = c12;
        Carrera c13 = new Carrera(21096, "Ingenieria Civil en Mecanica", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 90, 697.65, 506.8);
        arreglocarrera[12] = c13;
        Carrera c14 = new Carrera(21049, "Ingenieria Civil en Ciencia de Datos", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 60, 673.65, 539.35);
        arreglocarrera[13] = c14;
        Carrera c15 = new Carrera(21073, "Ingenieria en Biotecnologia", 0.15, 0.25, 0.2, 0.3, 0.1, 450, 0, 60, 675.8, 540.9);
        arreglocarrera[14] = c15;
        Carrera c16 = new Carrera(21012, "Contador Publico y Auditor", 0.2, 0.2, 0.3, 0.15, 0.15, 450, 0, 80, 635.55, 452.2);
        arreglocarrera[15] = c16;
        Carrera c17 = new Carrera(21032, "Ingenieria en Construccion", 0.2, 0.2, 0.15, 0.35, 0.1, 450, 0, 100, 716.3, 476.95);
        arreglocarrera[16] = c17;
        Carrera c18 = new Carrera(21024, "Diseño en Comunicacion Visual", 0.1, 0.4, 0.3, 0.1, 0.1, 450, 0, 100, 706.3, 440.2);
        arreglocarrera[17] = c18;
        Carrera c19 = new Carrera(21083, "Quimica Industrial", 0.1, 0.25, 0.15, 0.3, 0.2, 450, 0, 40, 596.05, 472);
        arreglocarrera[18] = c19;
        Carrera c20 = new Carrera(21023, "Diseño Industrial", 0.1, 0.4, 0.3, 0.1, 0.1, 450, 0, 65, 642.2, 439.9);
        arreglocarrera[19] = c20;
        Carrera c21 = new Carrera(21089, "Administracion Publica", 0.15, 0.2, 0.3, 0.25, 0.1, 450, 0, 35, 625.8, 513);
        arreglocarrera[20] = c21;
        Carrera c22 = new Carrera(21046, "Bachillerato en Ciencias de la Ingenieria", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 25, 586.45, 504.25);
        arreglocarrera[21] = c22;
        Carrera c23 = new Carrera(21087, "Ingenieria Civil en Prevencion de Riesgos y Medioambiente", 0.15, 0.35, 0.2, 0.2, 0.1, 450, 0, 30, 615.2, 462.85);
        arreglocarrera[22] = c23;
        Carrera c24 = new Carrera(21015, "Ingenieria en Administracion Agroindustrial", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 30, 628.8, 461.8);
        arreglocarrera[23] = c24;
        Carrera c25 = new Carrera(21002, "Bibliotecologia y Documentacion", 0.2, 0.2, 0.4, 0.1, 0.1, 450, 0, 35, 675.3, 453.6);
        arreglocarrera[24] = c25;
        Carrera c26 = new Carrera(21039, "Ingenieria en Industria Alimentaria", 0.15, 0.25, 0.2, 0.3, 0.1, 450, 0, 30, 680.2, 464.9);
        arreglocarrera[25] = c26;
        Carrera c27 = new Carrera(21071, "Dibujante Proyectista", 0.1, 0.25, 0.2, 0.35, 0.1, 450, 0, 25, 689.85, 496.45);
        arreglocarrera[26] = c27;
        Carrera c28 = new Carrera(21082, "Ingenieria en Gestion Turistica", 0.1, 0.2, 0.3, 0.3, 0.1, 450, 0, 25, 659.4, 448.1);
        arreglocarrera[27] = c28;
        return arreglocarrera;
    }
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
    public void escribirXLSX() throws IOException {
        Workbook book = new XSSFWorkbook();
        int fila_n;
        for(int i = 0; i<28; i++){
            fila_n = 0;
            Sheet hoja = book.createSheet(String.valueOf(arreglocarrera[i].getNombre())); // Se crea la hoja de la carrera
            Row fila = hoja.createRow(fila_n); // Se crea fila para ingresar datos, donde actualmente será la primera fila
            fila.createCell(0).setCellValue("N°"); 
            fila.createCell(1).setCellValue("Rut");//segunda columna: Ruts de los alumnos que están siendo matriculados
            fila.createCell(2).setCellValue("Ponderación"); // tercera columna: Puntaje final de los alumnos que lograron conseguir en la PSU
            fila_n++;
            switch(i){
                case 0: // Administración Pública 
                    for(int j = 0; j < a1.size() ; j++){ // Recorro la lista de alumnos que está entrando a la carrera
                        Alumno x = a1.get(j); // Se extraer los datos de un alumno
                        fila = hoja.createRow(fila_n); // Se crea una fila en la posicion fila_n
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        // Se escribe el puntaje de la carrera que está postulando de mayor conveniencia 
                        fila_n++; // Se avanza para la siguiente fila
                    }
                    a1.clear(); // Se libera los espacios del arreglo
                    break;
                // La misma lógica para otras carreras
                case 1: 
                    for(int j = 0; j < a2.size() ; j++){
                        Alumno x = a2.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a2.clear();
                    break;
                case 2:
                    for(int j = 0; j < a3.size() ; j++){
                        Alumno x = a3.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a3.clear();
                    break;
                case 3:
                    for(int j = 0; j < a4.size() ; j++){
                        Alumno x = a4.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a4.clear();
                    break;
                case 4:
                    for(int j = 0; j < a5.size() ; j++){
                        Alumno x = a5.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a5.clear();
                    break;
                case 5:
                    for(int j = 0; j < a6.size() ; j++){
                        Alumno x = a6.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a6.clear();
                    break;
                case 6:
                    for(int j = 0; j < a7.size() ; j++){
                        Alumno x = a7.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a7.clear();
                    break;
                case 7:
                    for(int j = 0; j < a8.size() ; j++){
                        Alumno x = a8.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a8.clear();
                    break;
                case 8:
                    for(int j = 0; j < a9.size() ; j++){
                        Alumno x = a9.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a9.clear();
                    break;
                case 9:
                    for(int j = 0; j < a10.size() ; j++){
                        Alumno x = a10.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a10.clear();
                    break;
                case 10:
                    for(int j = 0; j < a11.size() ; j++){
                        Alumno x = a11.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a11.clear();
                    break;
                case 11:
                    for(int j = 0; j < a12.size() ; j++){
                        Alumno x = a12.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a12.clear();
                    break;
                case 12:
                    for(int j = 0; j < a13.size() ; j++){
                        Alumno x = a13.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a13.clear();
                    break;
                case 13:
                    for(int j = 0; j < a14.size() ; j++){
                        Alumno x = a14.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a14.clear();
                    break;
                case 14:
                    for(int j = 0; j < a15.size() ; j++){
                        Alumno x = a15.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a15.clear();
                    break;
                case 15:
                    for(int j = 0; j < a16.size() ; j++){
                        Alumno x = a16.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a16.clear();
                    break;
                case 16:
                    for(int j = 0; j < a17.size() ; j++){
                        Alumno x = a17.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a17.clear();
                    break;
                case 17:
                    for(int j = 0; j < a18.size() ; j++){
                        Alumno x = a18.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a18.clear();
                    break;
                case 18:
                    for(int j = 0; j < a19.size() ; j++){
                        Alumno x = a19.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a19.clear();
                    break;
                case 19:
                    for(int j = 0; j < a20.size() ; j++){
                        Alumno x = a20.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a20.clear();
                    break;
                case 20:
                    for(int j = 0; j < a21.size() ; j++){
                        Alumno x = a21.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a21.clear();
                    break;
                case 21:
                    for(int j = 0; j < a22.size() ; j++){
                        Alumno x = a22.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a22.clear();
                    break;
                case 22:
                    for(int j = 0; j < a23.size() ; j++){
                        Alumno x = a23.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a23.clear();
                    break;
                case 23:
                    for(int j = 0; j < a24.size() ; j++){
                        Alumno x = a24.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a24.clear();
                    break;
                case 24:
                    for(int j = 0; j < a25.size() ; j++){
                        Alumno x = a25.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a25.clear();
                    break;
                case 25:
                    for(int j = 0; j < a26.size() ; j++){
                        Alumno x = a26.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a26.clear();
                    break;
                case 26:
                    for(int j = 0; j < a27.size() ; j++){
                        Alumno x = a27.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a27.clear();
                    break;
                case 27:
                    for(int j = 0; j < a28.size() ; j++){
                        Alumno x = a28.get(j);
                        fila = hoja.createRow(fila_n);
                        fila.createCell(0).setCellValue(j+1); // Se escribe el rut del alumno
                        fila.createCell(1).setCellValue(x.getRut());
                        fila.createCell(2).setCellValue(x.getPonderacionesfinales().get(0).getPuntajefinal());
                        fila_n++;
                    }
                    a28.clear();
                    break;
            }
        }
        FileOutputStream fileout = new FileOutputStream("excelpruebasoap10mil.xlsx");
        book.write(fileout);
        fileout.close();
        book.close();
    }
    public void desplazamientoAlumno(Alumno entrante){
        int entro = 0; // Para verificar que el alumno entró en alguna carrera
        // Ciclo While: Mientras existan otras opciones de carrera y que el alumno aun no entra alguna carrera
        while(!entrante.getPonderacionesfinales().isEmpty() && entro == 0){
            int carrera_actual = entrante.getPonderacionesfinales().get(0).getCarrera(); // Se obtiene la posicion de la carrera del arreglo
            switch(carrera_actual){ // Se identifica a cual de las 28 carreras están analizando.
                case 0:
                    if(var1 < arreglocarrera[carrera_actual].getVacantes()){ // Se verifica si hay cupos en la carrera
                        a1.add(entrante); // Se ingresa el alumno
                        var1++; // Se aumenta cantidad de alumnos que pueden ser matriculados
                        ordenar(a1); // Se ordena el arreglo de acuerdo los puntajes obtenidos
                        // en este caso solo interesa la primera posicion lo cual es la carrera actual que postula
                        entro = 1; // Alumno ya entró en las nominas de posibles matriculados
                    }
                    else{ // En caso de no haber más cupos
                        Alumno entrante2 = a1.get(a1.size()-1); // Se compara el ultimo posible alumno que puede entrar
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a1.set(a1.size()-1, entrante); // El ultimo alumno que pudiera entrar es reemplazado
                            entro = 1; // Alumno ya entró en las nominas de posibles matriculados
                            ordenar(a1); // Se ordena el arreglo de acuerdo los puntajes obtenidos.
                            entrante2.eliminarPonderacion(0); // Al ser reemplazado, se descarta la carrera que se encontraba
                            desplazamientoAlumno(entrante2); // Se verifica si el alumno reemplazado puede entrar otras carreras
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                            // Se descarta la carrera que se analizó y se compara las siguientes
                        }
                    }
                    break;
                // Las mismas logicas para otras carreras que se analizan
                case 1:
                    if(var2 < arreglocarrera[carrera_actual].getVacantes()){
                        a2.add(entrante);
                        var2++;
                        ordenar(a2);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a2.get(a2.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a2.set(a2.size()-1, entrante);
                            ordenar(a2);
                            entro = 1;
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 2:
                    if(var3 < arreglocarrera[carrera_actual].getVacantes()){
                        a3.add(entrante);
                        var3++;
                        ordenar(a3);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a3.get(a3.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a3.set(a3.size()-1, entrante);
                            entro = 1;
                            ordenar(a3);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 3:
                    if(var4 < arreglocarrera[carrera_actual].getVacantes()){
                        a4.add(entrante);
                        var4++;
                        ordenar(a4);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a4.get(a4.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a4.set(a4.size()-1, entrante);
                            entro = 1;
                            ordenar(a4);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 4:
                    if(var5 < arreglocarrera[carrera_actual].getVacantes()){
                        a5.add(entrante);
                        var5++;
                        ordenar(a5);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a5.get(a5.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a5.set(a5.size()-1, entrante);
                            entro = 1;
                            ordenar(a5);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 5:
                    if(var6 < arreglocarrera[carrera_actual].getVacantes()){
                        a6.add(entrante);
                        var6++;
                        ordenar(a6);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a6.get(a6.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a6.set(a6.size()-1, entrante);
                            entro = 1;
                            ordenar(a6);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 6:
                    if(var7 < arreglocarrera[carrera_actual].getVacantes()){
                        a7.add(entrante);
                        var7++;
                        ordenar(a7);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a7.get(a7.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a7.set(a7.size()-1, entrante);
                            entro = 1;
                            ordenar(a7);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 7:
                    if(var8 < arreglocarrera[carrera_actual].getVacantes()){
                        a8.add(entrante);
                        var8++;
                        ordenar(a8);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a8.get(a8.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a8.set(a8.size()-1, entrante);
                            entro = 1;
                            ordenar(a8);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 8:
                    if(var9 < arreglocarrera[carrera_actual].getVacantes()){
                        a9.add(entrante);
                        var9++;
                        ordenar(a9);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a9.get(a9.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a9.set(a9.size()-1, entrante);
                            entro = 1;
                            ordenar(a9);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 9:
                    if(var10 < arreglocarrera[carrera_actual].getVacantes()){
                        a10.add(entrante);
                        var10++;
                        ordenar(a10);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a10.get(a10.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a10.set(a10.size()-1, entrante);
                            entro = 1;
                            ordenar(a10);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 10:
                    if(var11 < arreglocarrera[carrera_actual].getVacantes()){
                        a11.add(entrante);
                        var11++;
                        ordenar(a11);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a11.get(a11.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a11.set(a11.size()-1, entrante);
                            entro = 1;
                            ordenar(a11);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 11:
                    if(var12 < arreglocarrera[carrera_actual].getVacantes()){
                        a12.add(entrante);
                        var12++;
                        ordenar(a12);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a12.get(a12.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a12.set(a12.size()-1, entrante);
                            entro = 1;
                            ordenar(a12);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 12:
                    if(var13 < arreglocarrera[carrera_actual].getVacantes()){
                        a13.add(entrante);
                        var13++;
                        ordenar(a13);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a13.get(a13.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a13.set(a13.size()-1, entrante);
                            entro = 1;
                            ordenar(a13);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 13:
                    if(var14 < arreglocarrera[carrera_actual].getVacantes()){
                        a14.add(entrante);
                        var14++;
                        ordenar(a14);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a14.get(a14.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a14.set(a14.size()-1, entrante);
                            entro = 1;
                            ordenar(a14);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 14:
                    if(var15 < arreglocarrera[carrera_actual].getVacantes()){
                        a15.add(entrante);
                        var15++;
                        ordenar(a15);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a15.get(a15.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a15.set(a15.size()-1, entrante);
                            entro = 1;
                            ordenar(a15);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 15:
                    if(var16 < arreglocarrera[carrera_actual].getVacantes()){
                        a16.add(entrante);
                        var16++;
                        ordenar(a16);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a16.get(a16.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a16.set(a16.size()-1, entrante);
                            entro = 1;
                            ordenar(a16);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 16:
                    if(var17 < arreglocarrera[carrera_actual].getVacantes()){
                        a17.add(entrante);
                        var17++;
                        ordenar(a17);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a17.get(a17.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a17.set(a17.size()-1, entrante);
                            entro = 1;
                            ordenar(a17);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 17:
                    if(var18 < arreglocarrera[carrera_actual].getVacantes()){
                        a18.add(entrante);
                        var18++;
                        ordenar(a18);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a18.get(a18.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a18.set(a18.size()-1, entrante);
                            entro = 1;
                            ordenar(a18);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 18:
                    if(var19 < arreglocarrera[carrera_actual].getVacantes()){
                        a19.add(entrante);
                        var19++;
                        ordenar(a19);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a19.get(a19.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a19.set(a19.size()-1, entrante);
                            entro = 1;
                            ordenar(a19);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 19:
                    if(var20 < arreglocarrera[carrera_actual].getVacantes()){
                        a20.add(entrante);
                        var20++;
                        ordenar(a20);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a20.get(a20.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a20.set(a20.size()-1, entrante);
                            entro = 1;
                            ordenar(a20);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 20:
                    if(var21 < arreglocarrera[carrera_actual].getVacantes()){
                        a21.add(entrante);
                        var21++;
                        ordenar(a21);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a21.get(a21.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a21.set(a21.size()-1, entrante);
                            entro = 1;
                            ordenar(a21);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 21:
                    if(var22 < arreglocarrera[carrera_actual].getVacantes()){
                        a22.add(entrante);
                        var22++;
                        ordenar(a22);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a22.get(a22.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a22.set(a22.size()-1, entrante);
                            entro = 1;
                            ordenar(a22);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 22:
                    if(var23 < arreglocarrera[carrera_actual].getVacantes()){
                        a23.add(entrante);
                        var23++;
                        ordenar(a23);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a23.get(a23.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a23.set(a23.size()-1, entrante);
                            entro = 1;
                            ordenar(a23);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 23:
                    if(var24 < arreglocarrera[carrera_actual].getVacantes()){
                        a24.add(entrante);
                        var24++;
                        ordenar(a24);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a24.get(a24.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a24.set(a24.size()-1, entrante);
                            entro = 1;
                            ordenar(a24);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 24:
                    if(var25 < arreglocarrera[carrera_actual].getVacantes()){
                        a25.add(entrante);
                        var25++;
                        ordenar(a25);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a25.get(a25.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a25.set(a25.size()-1, entrante);
                            entro = 1;
                            ordenar(a25);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 25:
                    if(var26 < arreglocarrera[carrera_actual].getVacantes()){
                        a26.add(entrante);
                        var26++;
                        ordenar(a26);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a26.get(a26.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a26.set(a26.size()-1, entrante);
                            entro = 1;
                            ordenar(a26);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 26:
                    if(var27 < arreglocarrera[carrera_actual].getVacantes()){
                        a27.add(entrante);
                        var27++;
                        ordenar(a27);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a27.get(a27.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a27.set(a27.size()-1, entrante);
                            entro = 1;
                            ordenar(a27);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
                case 27:
                    if(var28 < arreglocarrera[carrera_actual].getVacantes()){
                        a28.add(entrante);
                        var28++;
                        ordenar(a28);
                        entro = 1;
                    }
                    else{
                        Alumno entrante2 = a28.get(a28.size()-1);
                        if(entrante.getPonderacionesfinales().get(0).getPuntajefinal() > entrante2.getPonderacionesfinales().get(0).getPuntajefinal()){
                            a28.set(a28.size()-1, entrante);
                            entro = 1;
                            ordenar(a28);
                            entrante2.eliminarPonderacion(0);
                            desplazamientoAlumno(entrante2);
                        }
                        else{
                            entrante.eliminarPonderacion(0);
                        }
                    }
                    break;
            }
        } 
    }
    public  void leerdatos(String dato) throws IOException {
        String rut;
        String[] datos;
        String[] filas;
        ArrayList<Ponderacion> listaponderacion = new ArrayList<>();
        double nem, ranking, matematica, lenguaje, ciencia, historia, diferencia;
        filas =dato.split("\n");
        for (String fila : filas) {
            datos = fila.split(";"); // tipo string, datos = [rut, nem, ranking, matematica, lenguaje, ciencia, historia]
            rut = datos[0]; 
            nem = Double.parseDouble(datos[1]);
            ranking = Double.parseDouble(datos[2]);
            matematica = Double.parseDouble(datos[3]);
            lenguaje = Double.parseDouble(datos[4]);
            ciencia = Double.parseDouble(datos[5]);
            historia = Double.parseDouble(datos[6]);
            if((matematica + lenguaje)/2 > 450){ // Se verifica si se cumple puntaje minimo promedio para postular
                for(int a=0; a<28; a++){ // Se recorre las carreras
                    double ponderadofinal = calculoponderacion(arreglocarrera[a],nem, ranking, matematica,lenguaje,ciencia,historia);
                    // Se obtiene el ponderacion final obtenido
                    if(ponderadofinal > arreglocarrera[a].getPrimerpuntaje()){
                        diferencia = ponderadofinal;
                        Ponderacion carreraPonderada = new Ponderacion(diferencia, ponderadofinal, a);
                        listaponderacion.add(carreraPonderada);
                    }
                    else{
                        diferencia = ponderadofinal - arreglocarrera[a].getUltimopuntaje();
                        Ponderacion carreraPonderada = new Ponderacion(diferencia, ponderadofinal, a);
                        listaponderacion.add(carreraPonderada);
                    } 
                }
                Alumno entrante = new Alumno(rut, listaponderacion);
                listaponderacion.clear(); // Se vacia el arreglo creado
                entrante.ordenarPonderaciones(); // Se deja ordenado antes de analizar y/o agregar alumnos en alguna carrera
                desplazamientoAlumno(entrante);   
            }
        }           
        escribirXLSX();
    }
}
