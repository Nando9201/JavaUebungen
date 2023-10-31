import Blatt08.Blatt08;
import Blatt08.Bruchzahl;

public class Main {
    public static void main(String[] args) {

        Blatt08 aufgabe = new Blatt08();
        System.out.println(9 % 6);
        Bruchzahl a = new Bruchzahl(1,2);
        Bruchzahl b = new Bruchzahl(1,4);

        aufgabe.ausgeben(aufgabe.mul(a,b));
        aufgabe.ausgeben(aufgabe.div(a,b));



    }


    
}