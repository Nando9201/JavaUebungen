package Blatt09;

import Prog1Tools.IOTools;

public class Punkt {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void read(){
        x = IOTools.readDouble("x: ");
        y = IOTools.readDouble("y: ");
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
