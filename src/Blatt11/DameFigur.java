package Blatt11;

public class DameFigur extends Spielfigur {
    public DameFigur(char x, int y, String f) {
        super(x, y, f);
    }


    public void ziehe(char richtung, int anzahl) {
        switch (richtung) {
            case '-':
                super.ziehe(anzahl, 0);
                break;
            case '|':
                super.ziehe(0, anzahl);
                break;
            case '/':
                super.ziehe(anzahl, anzahl);
                break;
            case '\\':
                super.ziehe(-anzahl, anzahl);
                break;

        }
    }

    public boolean trifft (DameFigur figur) {
        return (getXpos() == figur.getXpos() && getYpos() == figur.getYpos());
    }

    @Override
    public String toString() {
        return getFarbe() + "e Dame auf Feld " + getXpos() + getYpos();
    }
}
