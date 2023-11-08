package Blatt09;

import Prog1Tools.IOTools;

public class BruchRechner {

    public static void main(String[] args) {
        String Eingabe;
        Bruch b1 = new Bruch(), b2 = new Bruch();
        do {
            System.out.println("x: beenden\n" +
                    "1: Bruch 1 eingeben\n" +
                    "2: Bruch 2 eingeben\n" +
                    "b: Brueche kuerzen\n" +
                    "*,/,+,-: Grundrechenarten\n" +
                    "n: Bruch 1 negativ\n" +
                    "k: Kehrwert von Bruch 1\n" +
                    "d: Double-Wert von Bruch 1");
            Eingabe = IOTools.readString("Eingabe: ");

            switch (Eingabe) {
                case "1":
                    b1.einlesen();
                    break;
                case "2":
                    b2.einlesen();
                    break;
                case "b":
                    b1.kuerzen();
                    b2.kuerzen();
                    break;
                case "*":
                    System.out.println(b1.mul(b2).kuerzen());
                    break;
                case "/":
                    System.out.println(b1.div(b2).kuerzen());
                    break;
                case "+":
                    System.out.println(b1.add(b2).kuerzen());
                    break;
                case "-":
                    System.out.println(b1.sub(b2).kuerzen());
                    break;
                case "n":
                    System.out.println(b1.neg());
                    break;
                case "k":
                    System.out.println(b1.Kehrwert());
                    break;
                case "d":
                    System.out.println(b1.wert());
                    break;
                case "x":
                    System.exit(0);
                    break;
            }


        } while (true);
    }

}
