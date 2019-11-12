package practica14;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;

public class LectorCSV {
 
  public static List<String[]> leer (String ruta) throws IOException {

  List<String> lineas = Files.readAllLines(Paths.get(ruta));
  LinkedList<String[]> datosCSV = new LinkedList<>();

  for (int i = 1; i < lineas.size(); i++) {

    String cadenas = lineas.get(i);

    if (cadenas.isBlank() == false) {

      String[] datos = cadenas.split(",");

      for (int j = 0; j < datos.length; j++) {

        datos[j] = datos[j].trim();
      }

      datosCSV.add(datos);
    }
  }
  return datosCSV;
 }
}

  