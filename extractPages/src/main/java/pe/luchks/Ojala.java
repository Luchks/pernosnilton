package pe.luchks;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Ojala {

    public static void main(String[] args) {
        String carpeta = "src/main/resources";
        List<FilaDinámica> filas = new ArrayList<>();

        File folder = new File(carpeta);
        File[] archivos = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".csv"));

        if (archivos == null || archivos.length == 0) {
            System.out.println("No se encontraron archivos CSV en " + carpeta);
            return;
        }

        for (File archivo : archivos) {
            System.out.println("Leyendo: " + archivo.getName());
            try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
                String[] filaCSV;
                int contador = 0;

                while ((filaCSV = reader.readNext()) != null && contador < 1) {
                    // Convertir fila en lista y agregar nombre del archivo
                    List<String> columnas = new ArrayList<>();
                    for (String col : filaCSV) {
                        columnas.add(col);
                    }
                    // 👉 Agregar nueva “columna” con el nombre del archivo (sin ruta)
                    columnas.add(archivo.getName());

                    filas.add(new FilaDinámica(columnas));
                    contador++;
                }

            } catch (Exception e) {
                System.err.println("Error en " + archivo.getName());
                e.printStackTrace();
            }
        }

        // Ejemplo de uso
        int counter = 0;
        for (FilaDinámica f : filas) {
            counter++;
            System.out.println("fila " + counter + ": " + f);
        }
        if (!filas.isEmpty()) {
            System.out.println("Primera columna de la primera fila: " + filas.get(0).get(0));
        }
    }
}
