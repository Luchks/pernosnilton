package pe.luchks;
import pe.luchks.columns.Column;
import pe.luchks.rows.Row;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Column yape= new Column(1,"Rodigro","Junior","Hello Happy");
        yape.setName01("   luchks");
        System.out.println( "Hello World!"+yape.getName01());
        System.out.println( "Hello World!"+yape.getName02());

        Row tape= new Row(1,"Rodigro","Junior","Hello Happy");
        tape.setName01("   Gerente Generarl");
        System.out.println( "Hello World!"+tape.getName01());
        System.out.println( "Hello World!"+tape.getName01());

    }
}
