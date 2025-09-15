package pe.luchks.rows;

public class Row {
    private int id;
    private String name01;
    private String name02;
    private String name03;
    private String name04;
    private String name05;
    private String name06;
    private String name07;
    private String name08;
    private String name09;
    private String name10;
    private String name11;

    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06, String name07, String name08, String name09, String name10, String name11) {
        this.id = id;
        this.name01 = name01;
        this.name02 = name02;
        this.name03 = name03;
        this.name04 = name04;
        this.name05 = name05;
        this.name06 = name06;
        this.name07 = name07;
        this.name08 = name08;
        this.name09 = name09;
        this.name10 = name10;
        this.name11 = name11;
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06, String name07, String name08, String name09, String name10) {
        this(id, name01, name02, name03, name04, name05, name06, name07, name08, name09, name10, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06, String name07, String name08, String name09) {
        this(id, name01, name02, name03, name04, name05, name06, name07, name08, name09, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06, String name07, String name08) {
        this(id, name01, name02, name03, name04, name05, name06, name07, name08, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06, String name07) {
        this(id, name01, name02, name03, name04, name05, name06, name07, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05, String name06) {
        this(id, name01, name02, name03, name04, name05, name06, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04, String name05) {
        this(id, name01, name02, name03, name04, name05, "");
    }
    public Row(int id, String name01, String name02, String name03, String name04) {
        this(id, name01, name02, name03, name04, "");
    }
    public Row(int id, String name01, String name02, String name03) {
        this(id, name01, name02, name03, "");
    }
    public Row(int id, String name01, String name02) {
        this(id, name01, name02, "");
    }
    public Row(int id, String name01) {
        this(id, name01, "");
    }
    public Row(int id) {
        this(id, "");
    }
    public Row() {
        this(0);
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName01(String name01) {
        this.name01 = name01;
    }
    public void setName02(String name02) {
        this.name02 = name02;
    }
    public void setName03(String name03) {
        this.name03 = name03;
    }
    public void setName04(String name04) {
        this.name04 = name04;
    }
    public void setName05(String name05) {
        this.name05 = name05;
    }
    public void setName06(String name06) {
        this.name06 = name06;
    }
    public void setName07(String name07) {
        this.name07 = name07;
    }
    public void setName08(String name08) {
        this.name08 = name08;
    }
    public void setName09(String name09) {
        this.name09 = name09;
    }
    public void setName10(String name10) {
        this.name10 = name10;
    }
    public void setName11(String name11) {
        this.name11 = name11;
    }
    public int getId() {
        return id;
    }
    public String getName01() {
        return name01;
    }
    public String getName02() {
        return name02;
    }
    public String getName03() {
        return name03;
    }
    public String getName04() {
        return name04;
    }
    public String getName05() {
        return name05;
    }
    public String getName06() {
        return name06;
    }
    public String getName07() {
        return name07;
    }
    public String getName08() {
        return name08;
    }
    public String getName09() {
        return name09;
    }
    public String getName10() {
        return name10;
    }
    public String getName11() {
        return name11;
    }
}

