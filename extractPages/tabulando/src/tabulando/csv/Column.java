package tabulando.csv;
import java.util.*;
public class Column {
    private String id_head;
    private String codeCompany;
    private String screwDiameter;
    public Column(String id_head, String codeCompany, String screwDiameter) {
        this.id_head = id_head;
        this.codeCompany = codeCompany;
        this.screwDiameter = screwDiameter;
    }
    public String getId_head() {
        return this.id_head;
    }
    public String getCodeCompany() {
        return this.codeCompany;
    }
    public String getScrewDiameter() {
        return this.screwDiameter;
    }
    public void setId_head(String id_head) {
        this.id_head = id_head;
    }
    public void setCodeCompany(String codeCompany) {
        this.codeCompany = codeCompany;
    }
    public void setScrewDiameter(String screwDiameter) {
        this.screwDiameter = screwDiameter;
    }
   }
