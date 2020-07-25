
package metodos;

import com.ctc.wstx.util.DataUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;


public class archivo {

    public archivo() {
    }
    
    public String nombre(){
        return "excelpruebasoapjavier \n";
    }
    public String mime(){
        return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet. \n";
    }

    public String leer(String datos) throws IOException{
        escribir b= new escribir();
        byte[] bytesdecodificado = Base64.getDecoder().decode(datos);
        String cadenadescadificada = new String(bytesdecodificado);
        b.datoscarreras();
        b.leerdatos(cadenadescadificada);
        File archivo= new File("excelpruebasoap10mil.xlsx");
        byte[] archivod =new byte[(int)archivo.length()];
        InputStream inputStream =new FileInputStream(archivo);
        inputStream.read(archivod);
        String archivoc =Base64.getEncoder().encodeToString(archivod);
        inputStream.close();
        return archivoc + "\n";
    }
}
