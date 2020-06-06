package metodos;

import clases.NOMBRE;

public class nombreServicio {

    public nombreServicio() {
    }

    public String listarnombre(String nombre, String apellidoP, String apellidoM, String genero) {
        NOMBRE a = new NOMBRE();
        a.setNombre(nombre);
        a.setApellidoP(apellidoP);
        a.setApellidoM(apellidoM);
        a.setGenero(genero);
        if("M".equals(a.genero)){
            return "Sr." + a.getNombre() +" "+ a.getApellidoP() + " "+ a.getApellidoM() + " "+ a.getGenero();
 
        }
        if("F".equals(a.genero)){
            return "Sra." + a.getNombre() +" "+ a.getApellidoP() + " "+ a.getApellidoM() + " "+ a.getGenero();
   
            
        }
        return null;
    }
}
