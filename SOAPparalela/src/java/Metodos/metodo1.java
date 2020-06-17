/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import clases.Nombre;


public class metodo1 {

    public metodo1() {
    }
    
    public String listarnombre(String nombre, String apellido) {
        Nombre a = new Nombre();
        a.setNombre(nombre);
        a.setApellido(apellido);
        return "Sr." + a.getNombre() +" "+ a.getApellido();
    }
    
}
