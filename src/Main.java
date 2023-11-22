import Blatt15.Berechne;
import Prog1Tools.IOTools;

public class Main {
    public static void main(String[] args) throws Exception {

        Berechne b = new Berechne();

        String Operation = IOTools.readString("operation: ");
        String Wert = IOTools.readString("wert: ");

        System.out.println(b.rechnung(Operation, Wert));



    }


}