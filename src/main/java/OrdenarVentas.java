
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarVentas {

    String producto;
    int cantidad;

    public Ventas(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Producto: " + producto + ", Cantidad: " + cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public <U> U getProducto() {
        return (U) producto;
    }
}
public class OrdenarVentas {
    public static void main(String[] args) {
        List<Ventas> ventas = new ArrayList<>();
        ventas.add(new Ventas("Manzanas", 50));
        ventas.add(new Ventas("Bananas", 20));
        ventas.add(new Ventas("Naranjas", 70));
