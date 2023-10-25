package U2;
import Prog1Tools.IOTools;

public class Aufgaben {

    public void a1(int t, int m, int j) {
        if (m <= 2) {
            m = m + 10;
            j--;
        } else {
            m = m - 2;
        }

        int c = j / 100;
        int y = j % 100;
        int h = (((26 * m - 2) / 10) + t + y + y / 4 + c / 4 - 2 * c) % 7;

        if (h < 0)
            h = h + 7;

        String[] wochentage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag",
                "Samstag"};

        System.out.println(wochentage[h]);
    }

     public void a2 (int input){
        for (int i = 1; i <= 10; i++) {
            System.out.println(input * i);
        }
    }

    public void a3(double geldbetrag, double prozentsatz, int jahre){
        for (int i = 1; i <= jahre ; i++) {
            geldbetrag = geldbetrag + geldbetrag * prozentsatz;
            System.out.println("Wert nach "+ i + " Jahre: "+ geldbetrag);
        }
    }
    public void a4(int zeilen){
        String output = "*";
        for (int i = 1; i <= zeilen; i++) {
            System.out.println(output);
            output = output + "*";
        }
    }
    public void a5(int zahl){

        System.out.println("Ausgabe in umgekehrter Reihenfolge:");
        while (zahl > 0) {
            int ziffer = zahl % 10;
            switch (ziffer) {
                case 0:
                    System.out.println("null");
                    break;
                case 1:
                    System.out.println("eins");
                    break;
                case 2:
                    System.out.println("zwei");
                    break;
                case 3:
                    System.out.println("drei");
                    break;
                case 4:
                    System.out.println("vier");
                    break;
                case 5:
                    System.out.println("fünf");
                    break;
                case 6:
                    System.out.println("sechs");
                    break;
                case 7:
                    System.out.println("sieben");
                    break;
                case 8:
                    System.out.println("acht");
                    break;
                case 9:
                    System.out.println("neun");
                    break;
            }
            zahl = zahl / 10;
        }

    }

    public void a6(){
        int geheimZahl = (int) (99 * Math.random() + 1);
        int input = 0;
        int versuche = 0;

        do {
            versuche++;
            input = IOTools.readInt("Bitte gib eine Zahl zwischen 1 und 100 ein");
            System.out.print("Versuch " + versuche + ": ");
            if (input > geheimZahl) {
                System.out.println("Die gesuchte Zahl ist kleiner");
            } else if (input < geheimZahl) {
                System.out.println("Die gesuchte Zahl ist größer");
            }
        } while (input != geheimZahl);
        System.out.println("Du hast die Zahl erraten");

    }

}
