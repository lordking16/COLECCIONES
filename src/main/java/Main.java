import java.util.*;

public class Main {
    public static void main(String[] args) {
        //USO DE LA CLASE CLASELISTA
        System.out.println("USO DE LA COLECCIÓN LIST \n");
        List<Integer> empleados =new ArrayList<>(); //Se crea una lista de empleados
        empleados.add(1);
        empleados.add(6);
        empleados.add(10);
        Lista listaEmpleados =new Lista(); //Se crea una instancia de clase ClaseLista
        listaEmpleados.setEmpleados(empleados);
        listaEmpleados.imprimirEmpleados();
        //IMPRMIR LOS VALORES DE LA LISTA
        for (int i=0;i<empleados.size();i++) {
            System.out.println("Indice: " + i + " Valor: " + empleados.get(i)); //IMPRIMIR TODOS LOS VALORES DE LA LISTA
        }

        //USO DE LA CLASE CLASESET
        System.out.println("USO DE LA COLECCIÓN SET \n");
        Set<String> meses=new HashSet<>();
        meses.add("ENERO");
        meses.add("FEBRERO");
        meses.add("MARZO");
        meses.add("ABRIL");
        ColeccionSet mes=new ColeccionSet();
        mes.setMeses(meses); //agregar meses
        System.out.println(mes.imprimirMeses());// imprimir los meses

        //USO DE LA CLASE CLASEMAP
        System.out.println("USO DE LA COLECCIÓN MAP \n");

        Map<Integer, String> paises = new HashMap<>();
        paises.put(1, "Mexico");
        paises.put(602, "Canada");
        paises.put(603, "Puerto Rico");
        Mapa mapa=new Mapa();
        mapa.setPaises(paises); //agregar Paises
        mapa.imprimirPaises(); //imprimir Paises

    }
}