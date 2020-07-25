/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webparalela;


import metodos.archivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "carreras")
public class carreras {

    archivo a = new archivo();
    @WebMethod(operationName = "carreras")
    public String archivo(@WebParam(name = "nombre") String nombre, @WebParam(name = "mime") String mime, @WebParam(name = "dato") String datos )  {
        String MIME = mime.toUpperCase();
        if(!"".equals(datos) && !"".equals(mime) && !"".equals(nombre)){
            if( "CSV/TEXT".equals(MIME)){
                try {
                    String nom = a.nombre();
                    String mimes = a.mime();
                    String dat = a.leer(datos);
                    return "NOMBRE: "+ nom + "\n "  +"MIME: "+ mimes +" \n"+ "Base64: "+ dat; 
                } catch (IOException ex) {
                    Logger.getLogger(carreras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                return "INGRESE TIPO MIME CORRESPONDIENTE";
            }  
        }
        else{
            return "INGRESE TODOS LOS DATOS";
        }
        
    return "ERROR";    
    }
}
