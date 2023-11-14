package Blatt13;

import java.util.Objects;

public class Kontostand extends Zahl{

    private final double wert;

    public Kontostand (double stand){
        this.wert = stand;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public Zahl neg() {
        return new Kontostand( wert * -1);
    }

    @Override
    public Zahl add(Zahl zahl) {
        Kontostand result = (Kontostand) zahl;
        return new Kontostand(result.getWert() + wert);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontostand that = (Kontostand) o;
        return Double.compare(wert, that.wert) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wert);
    }

    @Override
    public String toString() {
        return "Kontostand{" +
                "wert=" + wert +
                '}';
    }
}
