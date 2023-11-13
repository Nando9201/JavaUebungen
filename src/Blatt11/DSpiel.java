package Blatt11;

import Prog1Tools.IOTools;

public class DSpiel {
    public static void main(String[] args) {
        DameFigur beute, jaeger;
        beute = FigurErstellen();
        Bildschirm.loeschen();
        jaeger = FigurErstellen();

        if(beute.trifft(jaeger)) {
            System.out.println("Die Figuren treffen sich.");
            return;
        }

        System.out.println("Sie haben nun 10 Züge um die Beute zu fangen");

        for (int i = 0; i < 10; i++) {
            char richtung = IOTools.readChar("Wollen Sie waagrecht (-), senkrecht (|) oder diagonal (/, \\) ziehen? ");
            int anzahl = IOTools.readInt("Anzahl: ");
            jaeger.ziehe(richtung, anzahl);
            if(beute.trifft(jaeger)) {
                System.out.println("Die Figuren treffen sich.");
                return;
            }
        }
    }

    private static DameFigur FigurErstellen() {
        char x = IOTools.readChar("Spalte (A bis H) Ihrer Figur? ");
        int y = IOTools.readInt("Zeile (1 bis 8) Ihrer Figur? ");
        String farbe = IOTools.readString("Farbe: ");
        return new DameFigur(x, y, farbe);
    }
}
