import java.util.HashMap;
import java.util.Map;

public class Mapa {
    //CREAR UN MAPA DE PAR-VALOR DE ID_PAIS - PAIS
  private  Map<Integer, String> paises; //SE CREA LA variable empleados, de tipo Map
    public void setPaises(Map<Integer, String> mapaPaises) {
        this.paises=mapaPaises;
    }
    public void imprimirPaises() {
        paises.forEach((k,v)-> {
            System.out.println("ID de país:  " + k + " Nombre:" + v);
        });
    }
}
