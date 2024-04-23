import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AsociacionNumerosTexto {
    public static void main(String[] args) {
        Map<Integer, String> numerosTexto = new HashMap<>();
        numerosTexto.put(1, "Uno");
        numerosTexto.put(2, "Dos");
        numerosTexto.put(3, "Tres");
        numerosTexto.put(4, "Cuatro");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para obtener su representación textual: ");
        int numero = scanner.nextInt();

    }
