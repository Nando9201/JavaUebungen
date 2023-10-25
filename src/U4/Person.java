package U4;

public class Person {
    public static int Gesamtzahl = 0;
    String Nachname, Vorname;

    public int getAlter() {
        return Alter;
    }

    int Alter, Persnalnumer;

    public Person (String Nachname, String Vorname, int Alter, int Personalnumer){
        this.Nachname = Nachname;
        this.Vorname = Vorname;
        this.Alter = Alter;
        this.Persnalnumer = Personalnumer;
    }

    @Override
    public String toString() {
        return Vorname +  " " + Nachname+ " , " + Alter + " Jahre, persNr. " + Persnalnumer;
    }
}
