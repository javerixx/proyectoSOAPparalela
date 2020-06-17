/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEBs.PARALELA;

import Metodos.archivo;
import Metodos.metodo1;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "CARRERASSOAP")
public class CARRERASSOAP {

    metodo1 c =new metodo1();
    @WebMethod(operationName = "HOLA")
    public String hola(@WebParam(name = "name") String nombre, @WebParam(name = "apellido") String apellido) {
        return c.listarnombre(nombre, apellido);
    }
    
    /*archivo a=new archivo();
    @WebMethod(operationName = "leer")
    public void archivo(@WebParam(name = "archivo") String archivo) {
        a.leerPuntajesycodificar(archivo);
        a.decodificaryleer("base64codificado.txt");
    }*/
    
}
