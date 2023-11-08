package Blatt09;

public class Strecke {

    Punkt p, q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    public void read() {
        p.read();
        q.read();
    }

    public double getLaenge() {
        return Math.sqrt(Math.pow((p.getX() - q.getX()), 2) + Math.pow((p.getY() - q.getY()), 2));
    }

    @Override
    public String toString() {
        return "Strecke{" +
                "p=" + p +
                ", q=" + q +
                '}';
    }
}
