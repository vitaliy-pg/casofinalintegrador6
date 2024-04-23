
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
