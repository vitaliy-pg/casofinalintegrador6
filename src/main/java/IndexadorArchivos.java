import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List   ;

public class IndexadorArchivos {

    private List<Archivos> archivos = new ArrayList<>();

    public void indexarDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        File[] archivosEnDirectorio = directorio.listFiles();
        if (archivosEnDirectorio != null) {
            for (File Archivos : archivosEnDirectorio) {
                if (Archivos.isFile()) {
                    archivos.add(new Archivos(Archivos.getName(), Archivos.getAbsolutePath()));
                } else if (Archivos.isDirectory()) {
                    indexarDirectorio(Archivos.getAbsolutePath());
                }
            }
        }
}
