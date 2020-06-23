/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEBs.PARALELA;


import Metodos.archivo;
import Metodos.metodo1;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "CARRERASSOAP")
public class CARRERASSOAP {

    metodo1 c =new metodo1();
    @WebMethod(operationName = "carreras")
    public String hola(@WebParam(name = "nombre") String nombre, @WebParam(name = "mime") String apellido, @WebParam(name = "dato") String dato) {
        return c.listarnombre(nombre, apellido);
    }
    
    archivo a=new archivo();
    @WebMethod(operationName = "leer")
    public String archivo(@WebParam(name = "dato") String datos) {
        return a.leer(datos);
    }
    
}
