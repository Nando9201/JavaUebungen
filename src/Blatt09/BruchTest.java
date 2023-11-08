package Blatt09;

public class BruchTest {


    public static void main(String[] args) {
        Bruch b1 = new Bruch(1,2), b2 = new Bruch(3,4);

        //b1.einlesen();
        //b2.einlesen();

        System.out.println("mul: " + b1.mul(b2));
        System.out.println("div: " + b1.div(b2).kuerzen());
        System.out.println("add: " + b1.add(b2).kuerzen());
        System.out.println("sub: " + b1.sub(b2).kuerzen());
        System.out.println(b1.wert());
        System.out.println(b1.Kehrwert());
        System.out.println(b1.neg());
        System.out.println(b1.kuerzen());
    }


}
