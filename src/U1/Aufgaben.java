package U1;

import Prog1Tools.IOTools;

public class Aufgaben {
    public void a1() {
        int i = 10 / 3;
        double d = 10 / 3.0;
        double m = 10 % 3;

        System.out.println(i);
        System.out.println(d);
        System.out.println(m);
    }

    public void a2() {
        System.out.println("Bitte gib dein Namen ein");
        String name = IOTools.readString();
        System.out.println("Bitte gib dein Alter ein");
        int alter = IOTools.readInt();
        int alterInTage = alter * 365;

        System.out.println("Hallo " + name + " dein Alter in Tagen ist: " + alterInTage);

    }

    public void a4() {
        int sec, minuten, stunden, tage, jahre, rest;
        System.out.println("Bitte Sekunden eingeben:");
        sec = IOTools.readInt();
        jahre = sec / (365 * 24 * 60 * 60);
        rest = sec % (365 * 24 * 60 * 60);

        tage = rest / (24 * 60 * 60);
        rest = rest % (24 * 60 * 60);

        stunden = rest / (60 * 60);
        rest = rest % (60 * 60);

        minuten = rest / 60;
        rest = sec % 60;

        System.out.println("Jahre:" + jahre);
        System.out.println("Tage:" + tage);
        System.out.println("Stunden:" + stunden);
        System.out.println("Minuten:" + minuten);
        System.out.println("Rest:" + rest);

    }

    public void a6() {
        double x1 = Math.pow(10, 20);
        double x2 = 1223;
        double x3 = Math.pow(10, 18);
        double x4 = Math.pow(10, 15);
        double x5 = 3;
        double x6 = -Math.pow(10, 12);
        double y1 = Math.pow(10, 20);
        double y2 = 2;
        double y3 = -Math.pow(10, 22);
        double y4 = Math.pow(10, 13);
        double y5 = 2111;
        double y6 = Math.pow(10, 16);

        double a1 = x1 * y1 + x2 * y2 + x3 * y3 + x4 * y4 + x5 * y5 + x6 * y6;

        double x = 192119201;
        double y = 35675640;

        double a2 = 1.0 / 107751 * (1682 * x * (y * y * y * y) + 3 * (x * x * x) + 29 * x * (y * y) - 2 * (x * x * x * x * x) + 832);

        double a3 = ((x * (y * y) / 107751.0) * (1682.0 * (y * y) + 29.0)) + (((x * x * x) / 107751.0) * (3.0 - 2.0 * (x * x))) + 832.0 / 107751.0;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
