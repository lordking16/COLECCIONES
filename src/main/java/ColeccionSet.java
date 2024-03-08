import java.util.Set;

public class ColeccionSet {
    private Set<String> meses;
    public ColeccionSet() {
    }

    public void setMeses(Set<String> meses){
        this.meses=meses;
    }

    public String imprimirMeses(){
        String mensaje = "";
        for (String i:meses){
            mensaje =mensaje + i +"\n"; //concatenar valores a variable mensaje
        }
        return mensaje;
    }


}
