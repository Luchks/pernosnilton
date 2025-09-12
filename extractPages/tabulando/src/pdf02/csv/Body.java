package pdf02.csv;
import java.util.*;

public class Body {
    private String column01;
    private String column02; 
    private String column03; 
    private String column04; 
    private String column05; 
    public Body(String column01, String column02, String column03, String column04, String column05) {
        this.column01 = column01;
        this.column02 = column02;
        this.column03 = column03;
        this.column04 = column04;
        this.column05 = column05;
    }
    public String getColumn01() {
        return this.column01;
    }
    public String getColumn02() {
        return this.column02;
    }
    public String getColumn03() {
        return this.column03;
    }
    public String getColumn04() {
        return this.column04;
    }
    public String getColumn05() {
        return this.column05;
    }
    public void setColumn01(String column01) {
        this.column01 = column01;
    }
    public void setColumn02(String column02) {
        this.column02 = column02;
    }
    public void setColumn03(String column03) {
        this.column03 = column03;
    }
    public void setColumn04(String column04) {
        this.column04 = column04;
    }
    public void setColumn05(String column05) {
        this.column05 = column05;
    }
}
