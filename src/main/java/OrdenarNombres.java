
import java.util.Set;
import java.util.TreeSet;

public class OrdenarNombres {

    public static void main(String[] args) {
        Set<String> nombres = new TreeSet<>();
        nombres.add("Adriana");
        nombres.add("Vitaliy");
        nombres.add("Sebastian");
        nombres.add("Ruben");

        System.out.println("Nombres ordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    }
