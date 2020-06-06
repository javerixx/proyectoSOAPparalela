package webSSOAP;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import metodos.nombreServicio;
import metodos.rutServicio;
import org.apache.commons.lang3.text.WordUtils;

@WebService(serviceName = "ProyetoWebServiceSOAP")
public class ProyetoWebServiceSOAP {
 
    nombreServicio c = new nombreServicio(); 
          
    @WebMethod(operationName = "saludar")
    public String saludar(@WebParam(name = "nombre") String nombre, @WebParam(name="apellidoP") String apellidoP, @WebParam(name="apellidoM") String apellidoM, @WebParam(name="genero") String genero) {
        return c.listarnombre(WordUtils.capitalizeFully(nombre), WordUtils.capitalizeFully(apellidoP), WordUtils.capitalizeFully(apellidoM), WordUtils.capitalizeFully(genero));
    }
    
    rutServicio d = new rutServicio();
    
    @WebMethod(operationName="Validar-RUT")
    public String validar_rut(@WebParam(name="rut")String rut){
        return d.vaidarRUT(rut);
    }
}
