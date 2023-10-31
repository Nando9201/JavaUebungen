package Blatt07;

import Prog1Tools.IOTools;

public class Aufgaben {

    public void a1() {
        int personenAnzahl = IOTools.readInt("Wie viele Personen willst du angeben:");
        Person[] personen = new Person[personenAnzahl];
        String Nachname, Vorname;

        int Alter;
        for (int i = 0; i < personenAnzahl; i++) {
            System.out.println((i + 1) + ". Personen:");
            Vorname = IOTools.readString("Vorname: ");
            Nachname = IOTools.readString("Nachname");
            Alter = IOTools.readInt("Alter: ");

            personen[i] = new Person(Nachname, Vorname, Alter);
        }

        PersonenSortieren(personen);
        PrintPersonen(personen);
        PersonenStatistik(personen);

    }

    private void PrintPersonen(Person[] Personen) {

        for (int i = 0; i < Personen.length; i++) {
            System.out.println("Person " + (i + 1) + " :" + Personen[i].toString());
        }
    }

    private void PersonenSortieren(Person[] Personen) {

        for (int k = 0; k < Personen.length - 1; k++) {
            int j = 0;
            Person tmp;
            while (j < Personen.length - 1) {
                if (Personen[j].Alter > Personen[j + 1].Alter) {
                    tmp = Personen[j];
                    Personen[j] = Personen[j + 1];
                    Personen[j + 1] = tmp;
                }
                j++;
            }
        }
    }

    private void PersonenStatistik(Person[] Personen) {
        int MaxAlter = Personen[0].getAlter();
        int MinAlter = Personen[0].getAlter();
        double Summe = Personen[0].getAlter();
        double Mittelwert;
        //Min Max
        for (int i = 1; i < Personen.length; i++) {
            if (Personen[i].getAlter() > MaxAlter) MaxAlter = Personen[i].getAlter();
            if (Personen[i].getAlter() < MinAlter) MinAlter = Personen[i].getAlter();
            Summe += Personen[i].getAlter();
        }
        Mittelwert = Summe / Personen.length;

        System.out.println("Min Alter: " + MinAlter);
        System.out.println("Max Alter: " + MaxAlter);
        System.out.println("Durchschnittsalter: " + Mittelwert);

        double Varianz = 0;
        for (Person person : Personen) {
            Varianz += Math.pow(person.getAlter() - Mittelwert, 2) * ((double) 1 / Personen.length);
        }
        System.out.println("Varianz beträgt: " + Varianz);

    }


}

