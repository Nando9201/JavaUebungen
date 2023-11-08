package Blatt09;

import Prog1Tools.IOTools;

public class Blatt09 {

    public void Aufgabe35(){
        CD test = new CD(
                IOTools.readString("Titel: "),
                IOTools.readInt("Dauer"),
                IOTools.readBoolean("Ausgeliehen: ")
        );

        System.out.println(test.toString());
    }


    public void Aufgabe36(){
        int lenght = IOTools.readInt("Wie viele CDs: ");
        CD[] cdf = new CD[lenght];
        Party.einlesen(cdf);
        Party.sortieren(cdf);
        Party.vorhandeneAusgeben(cdf);
    }
}
