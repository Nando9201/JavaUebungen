package Blatt11;

public class FarbFernseher extends Fernseher{

    private int Farbwert;
    private static final int MaxFarbwert = 50;
    public FarbFernseher(String ra, int vo, int pr, int Farbwert) {
        super(ra, vo, pr);
        this.Farbwert = Farbwert;
    }

    @Override
    public void change(String einstell, int wert) {

        if(einstell.equals("color")){
            Farbwert = Farbwert + wert;
            Farbwert = Math.max(0,Math.min(Farbwert,MaxFarbwert));
        }else{
            super.change(einstell, wert);
        }

    }

    public boolean istAngenehmerAls(FarbFernseher f){
        return (this.getVolume() < f.getVolume() && this.Farbwert < 40 && this.Farbwert > f.Farbwert);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Farbwert=" + Farbwert;
    }
}
