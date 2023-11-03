package Blatt08;

import Prog1Tools.IOTools;

public class Blatt08 {


    void readWerte(double[] zahlen) {
        int n = IOTools.readInt("Wie viele Zahlen sollen eingegeben werden?");
        zahlen = new double[n];
        for (int i = 0; i < n; i++) {
            zahlen[i] = IOTools.readDouble("Zahl eingeben: ");
        }
    }

    double mittelwert(double[] zahlen) {
        double summe = 0;
        for (double zahl : zahlen) {
            summe = zahl + summe;
        }
        return summe / zahlen.length;
    }

    double varianz(double[] zahlen) {
        double varianz = 0;
        double mittelwert = mittelwert(zahlen);
        for (double zahl : zahlen) {
            varianz += Math.pow(zahl - mittelwert, 2) * ((double) 1 / zahlen.length);
        }
        return varianz;
    }

    public long QuersummeBerechnen(long zahl) {
        long summe = 0;
        while (zahl > 0) {
            summe = summe + (zahl % 10);
            zahl = zahl / 10;
        }
        return summe;
    }

    public void Aufgabe30() {
        long x = IOTools.readLong("Zahl eingeben");
        int counter = 0;
        do {
            counter++;
            x = QuersummeBerechnen(x);
        } while (x > 9);

        System.out.println(x);
        System.out.println(counter + " Durchläufe");
    }

    public int Aufgabe31(int a, int b) {
        if (a == 0) return b;
        if (b == a) return a;

        if (a < 0) a = a * -1;
        int x = a;
        if (b < 0) b = b * -1;
        int y = b;

        while (x != y) {
            if (x > y) x = x - y;
            else y = y - x;
        }

        return x;
    }

    public void einlesen(Bruchzahl a) {
        a.zaehler = IOTools.readInt("Zeahler eingeben: ");
        int nenner;
        do {
            nenner = IOTools.readInt("Nenner eingeben: ");
        } while (nenner == 0);
        a.nenner = nenner;
    }

    public void ausgeben(Bruchzahl a) {
        kuerzen(a);
        System.out.println(a.zaehler + "/" + a.nenner);
    }

    public static void berechnen(Bruchzahl a) {
        double erg = (double) a.zaehler / a.nenner;
        System.out.println(erg);
    }

    public Bruchzahl kehrwert(Bruchzahl a) {
        return new Bruchzahl(a.nenner, a.zaehler);
    }

    public Bruchzahl neg(Bruchzahl a) {
        return new Bruchzahl(a.zaehler * -1, a.nenner);
    }

    public void kuerzen(Bruchzahl a) {
        //20/10
        if (a.nenner < 0) a.nenner = a.nenner * -1;
        if (a.zaehler < 0) a.zaehler = a.zaehler * -1;

        int kleinsterGemeinsamerTeiler = Aufgabe31(a.zaehler, a.nenner);

        a.nenner = a.nenner / kleinsterGemeinsamerTeiler;
        a.zaehler = a.zaehler / kleinsterGemeinsamerTeiler;

    }

    public Bruchzahl mul(Bruchzahl a, Bruchzahl b) {
        return new Bruchzahl(a.zaehler * b.zaehler, a.nenner * b.nenner);
    }

    public Bruchzahl div(Bruchzahl a, Bruchzahl b) {
        return mul(a, kehrwert(b));
    }

    public Bruchzahl add(Bruchzahl a, Bruchzahl b) {
        Bruchzahl result = new Bruchzahl(0, 0);
        result.nenner = a.nenner * b.nenner;
        result.zaehler = (a.zaehler * b.nenner) * b.zaehler * a.nenner;
        kuerzen(result);
        return result;
    }

    public Bruchzahl sub(Bruchzahl a, Bruchzahl b) {
        b.zaehler = b.zaehler * -1;
        b.nenner = b.nenner * -1;
        return add(a, b);
    }
}
