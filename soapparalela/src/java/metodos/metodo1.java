/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.nombre;


public class metodo1 {

    public metodo1() {
    }
    
    public String listarnombre(String nombre, String apellido) {
        nombre a = new nombre();
        a.setNombre(nombre);
        a.setApellido(apellido);
        return "Sr." + a.getNombre() +" "+ a.getApellido();
    }
    
}
