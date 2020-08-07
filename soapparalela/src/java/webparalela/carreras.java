/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webparalela;


import metodos.Main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "carreras") //nombre del servidor soap
public class carreras {

    Main a = new Main();
    @WebMethod(operationName = "carreras") // metodo carreras
    public String archivo(@WebParam(name = "nombre") String nombre, @WebParam(name = "mime") String mime, @WebParam(name = "dato") String datos )  {
        String MIME = mime.toUpperCase(); //coloca el mime ingresado en mayusculas
        if(!"".equals(datos) && !"".equals(mime) && !"".equals(nombre)){//verifica que  se ingresen todos los datos
            if( "CSV/TEXT".equals(MIME) || "CSV".equals(MIME) || "TEXT".equals(MIME) || "TEXT/CSV".equals(MIME)){ //verifica si es el tipo mime correccto
                try {
                    return "NOMBRE: "+ a.nombre() + "\n "  +"MIME: "+ a.mime() +" \n"+ "Base64: "+ a.leer(datos); 
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
