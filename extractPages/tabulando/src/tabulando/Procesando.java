package tabulando;
import java.util.*;
import tabulando.csv.*;

public class Procesando {
    public static void main(String[] args) {

        List<Head> listHead = new ArrayList<Head>();
        listHead.add(new Head("1","PERNO HEXAGONAL MÉTRICO RC - CL. 5.8 TROPICALIZADO","M2205","Ø M5"));
        listHead.add(new Head("2","PERNO HEXAGONAL MÉTRICO RC - CL. 5.8 TROPICALIZADO","M2206","Ø M6"));
        listHead.add(new Head("3","PERNO HEXAGONAL MÉTRICO RC - CL. 5.8 TROPICALIZADO","M2208","Ø M8"));
        listHead.add(new Head("4","PERNO HEXAGONAL MÉTRICO RC - CL. 5.8 TROPICALIZADO","M2210","Ø M10"));
        listHead.add(new Head("5","PERNO HEXAGONAL MÉTRICO RC - CL. 5.8 TROPICALIZADO","E2212","Ø M12"));


        List<Row> listRow = new ArrayList<Row>();
        listRow.add(new Row("1","02","10"));
        listRow.add(new Row("2","03","15"));
        listRow.add(new Row("3","04","20"));
        listRow.add(new Row("4","05","25"));
        listRow.add(new Row("5","06","30"));
        listRow.add(new Row("6","07","35"));
        listRow.add(new Row("7","08","40"));
        listRow.add(new Row("8","10","50"));
        listRow.add(new Row("9","12","60"));
        listRow.add(new Row("10","14","70"));
        listRow.add(new Row("11","16","80"));
        listRow.add(new Row("12","20","100"));


        String[][] listBody = {
            {"$1.89","$2.27","","",""},
            {"$2.45","$2.68","$5.48","",""},
            {"$2.66","$3.04","$5.99","",""},
            {"$3.25","$3.52","$7.17","",""},
            {"$3.88","$3.94","$8.00","$12.72","$68.05"},
            {"$4.27","$4.35","$8.41","$14.40",""},
            {"$4.83","$4.87","$9.19","$16.05","$77.36"},
            {"$5.62","$5.62","$10.79","$17.65","$89.60"},
            {"","$6.56","$12.24","$20.07","$103.82"},
            {"","","$14.36","","$118.60"},
            {"","","$16.31","","$133.80"},
            {"","","$19.23","","$156.23"}
        }; 


        String[][] listBodyCto = {
            {"100 CTO","60 CTO","","",""},
            {"77 CTO","50 CTO","25 CTO","",""},
            {"68 CTO","43 CTO","21 CTO","",""},
            {"55.5 CTO","37.5 CTO","18.5 CTO","",""},
            {"50 CTO","33.5 CTO","17 CTO","9.5 CTO","1.9 CTO"},
            {"43 CTO","29 CTO","15 CTO","8.8 CTO",""},
            {"39 CTO","27 CTO","13.5 CTO","8 CTO","1.7 CTO"},
            {"30 CTO","20 CTO","11 CTO","6 CTO","1.42 CTO"},
            {"","16 CTO","10 CTO","6 CTO","1.2 CTO"},
            {"","","7 CTO","","1.05 CTO"},
            {"","","7 CTO","","0.9 CTO"},
            {"","","6.5 CTO","","0.8 CTO"}

        };
        for(int i = 0; i < listHead.size(); i++ ){
            for(int j = 0; j < listRow.size(); j++){
            	System.out.print(listHead.get(i).getId_head());
            	System.out.print(",");
            	System.out.print(listRow.get(j).getId_row());
            	System.out.print(",");
            	System.out.print(listBody[j][i]);
            	System.out.print(",");
            	System.out.print(listBodyCto[j][i]);

            	System.out.println();
            }
        }
    }
}
