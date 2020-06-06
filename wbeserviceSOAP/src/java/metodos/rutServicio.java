package metodos;

import clases.RUT;

public class rutServicio {

    public rutServicio() {
    }

    public String vaidarRUT(String rut) {
        RUT c = new RUT();
        String dv, dvc;
        int rutsdv, multiplicacion, suma = 0, cont = 2, division;
        rut = rut.replace("-", "");
        rut = rut.replace(".", "");
        c.setRut(rut);
        dv = rut.substring(rut.length() - 1);
        dv = dv.toUpperCase();
        rutsdv = Integer.parseInt(rut.substring(0, rut.length() - 1));
        while (rutsdv != 0) {
            multiplicacion = (rutsdv % 10) * cont;
            suma = suma + multiplicacion;
            rutsdv = rutsdv / 10;
            cont++;
            if (cont == 8) {
                cont = 2;
            }
        }
        division = 11 - (suma % 11);
        dvc = String.valueOf(division);
        if (division == 10) {
            dvc = "K";
        }
        if (division == 11) {
            dvc = "0";
        }
        if (dv.equals(dvc)) {
            return  " el rut es valido";
        } else {
            return " el rut no es valido";
        }
    }

}
