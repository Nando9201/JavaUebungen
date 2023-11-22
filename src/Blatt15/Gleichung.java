package Blatt15;

public class Gleichung {

    Double a,b,c;

    Gleichung(String a, String b, String c){
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }

    Loesung berechneLoesung () throws NichtquadratischException, UnloesbarException {
        if (a == 0) {
            throw new NichtquadratischException("a darf nicht 0 sein!");
        }

        Double d = b * b - 4 * a * c;

        if (d < 0) {
            throw new UnloesbarException("b*b-4*a*c = " + d + " < 0");
        }

        Double w = Math.sqrt(d);

        return new Loesung((-b + w) / (2 * a), (-b - w) / (2 * a));

    }
}
