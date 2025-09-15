package pe.luchks;

import java.util.ArrayList;
import java.util.List;

public class FilaDinámica {
    private List<String> columnas;

    public FilaDinámica() {
        this.columnas = new ArrayList<>();
    }

    public FilaDinámica(List<String> columnas) {
        this.columnas = columnas;
    }

    public List<String> getColumnas() {
        return columnas;
    }

    public void setColumnas(List<String> columnas) {
        this.columnas = columnas;
    }

    public String get(int index) {
        if (index < columnas.size()) {
            return columnas.get(index);
        }
        return "";
    }

    @Override
    public String toString() {
        return String.join(" | ", columnas);
    }
}
