package Blatt09;

public class Sound {

    String raum;
    int laut, bass, hoch;

    public int getLautstaerke() {
        return laut;
    }
    public Sound(String raum, int laut, int bass, int hoch) {
        this.raum = raum;
        this.laut = laut;
        this.bass = bass;
        this.hoch = hoch;
    }

    public void verstaerke (String regler, int wert){
        switch (regler){
            case "baesse":
                bass = bass + wert;
                return;
            case "hoehen":
                hoch = hoch + wert;
                return;
            case "lautstaerke":
                laut = laut + wert;
        }
    }

    @Override
    public String toString() {
        return "Anlage im Raum " + raum + ": la: " + laut +", ba: "+ bass + ", ho: "+ hoch;
    }
}
