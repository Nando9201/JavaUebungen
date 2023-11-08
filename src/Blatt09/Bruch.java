package Blatt09;

import Blatt08.Blatt08;
import Prog1Tools.IOTools;

public class Bruch {
    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    int zaehler = 0, nenner = 0;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch() {
    }

    public void einlesen() {
        zaehler = IOTools.readInt("Zaehler: ");
        do {
            nenner = IOTools.readInt("Nenner (0 nicht erlaubt): ");
        } while (nenner == 0);
    }

    public Bruch kuerzen() {
        Bruch result = new Bruch();
        if (nenner < 0) result.nenner = nenner * -1;
        if (zaehler < 0) result.zaehler = zaehler * -1;

        int kleinsterGemeinsamerTeiler = Blatt08.Aufgabe31(zaehler, nenner);

        result.nenner = nenner / kleinsterGemeinsamerTeiler;
        result.zaehler = zaehler / kleinsterGemeinsamerTeiler;

        return result;

    }

    public Bruch Kehrwert() {
        return new Bruch(nenner, zaehler);
    }

    public Bruch neg() {
        return new Bruch(zaehler * -1, nenner);
    }

    public double wert() {
        return (double) zaehler / nenner;
    }

    public Bruch mul(Bruch a) {
        return new Bruch(zaehler * a.getZaehler(), nenner * a.getNenner());
    }

    public Bruch div(Bruch a) {
        return mul(a.Kehrwert());
    }

    public Bruch add(Bruch a) {
        Bruch result = new Bruch(0, 0);
        result.nenner = nenner * a.getNenner();
        result.zaehler = zaehler * a.getNenner() + a.getZaehler() * nenner;
        return result;
    }

    public Bruch sub(Bruch a) {
        int tmpzaehler = zaehler*a.getNenner() - nenner*a.getZaehler();
        int tmpnenner = nenner*a.nenner;
        return new Bruch(tmpzaehler, tmpnenner);
    }


    @Override
    public String toString() {
        return "Bruch{" +
                "zaehler=" + zaehler +
                "/ nenner=" + nenner +
                '}';
    }
}
