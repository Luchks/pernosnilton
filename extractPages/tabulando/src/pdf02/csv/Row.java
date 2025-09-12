package pdf02.csv;
import java.util.*;
public class Row {
    private String id_row;
    private String cod;
    private String largo;
    private String nameTable;
    public Row(String id_row, String cod, String largo, String nameTable) {
        this.id_row = id_row;
        this.cod = cod;
        this.largo = largo;
        this.nameTable = nameTable;
    }
    public String getId_row() {
        return this.id_row;
    }
    public String getCod() {
        return this.cod;
    }
    public String getLargo() {
        return this.largo;
    }
    public String getNameTable() {
        return this.nameTable;
    }
    public void setId_row(String id_row) {
        this.id_row = id_row;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public void setLargo(String largo) {
        this.largo = largo;
    }
    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }
}
