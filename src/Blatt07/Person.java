package Blatt07;

public class Person {
    public static int Gesamtzahl = 0;
    String Nachname, Vorname;

    public int getAlter() {
        return Alter;
    }

    int Alter, Personalnummer;

    public Person(String Nachname, String Vorname, int Alter) {
        this.Nachname = Nachname;
        this.Vorname = Vorname;
        this.Alter = Alter;
        this.Personalnummer = ++Gesamtzahl;
    }

    @Override
    public String toString() {
        return Vorname + " " + Nachname + " , " + Alter + " Jahre, persNr. " + Personalnummer;
    }
}
