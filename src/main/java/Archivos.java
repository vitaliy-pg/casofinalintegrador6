class Archivos implements Comparable<Archivos> {
    final String nombre;
    private final String ruta;

    public Archivos(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }
