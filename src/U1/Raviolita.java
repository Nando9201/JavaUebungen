package U1;

public class Raviolita {
    double u,h;
    public Raviolita(double u, double h){
        this.u = u;
        this.h = h;
    }
    public double calcDiagonale(){
        return Math.sqrt(Math.pow(u,2) + Math.pow(h,2));
    }
    public double calcDurchmesser(){
        return u / Math.PI;
    }

    public double calcFlaecheDosenboden(){
       return Math.PI * Math.pow((calcDurchmesser()/2),2);
    }

    public double calcMantelflaeche(){
        return u * h;
    }

    public double calcGesamflaeche(){
        return 2 * calcFlaecheDosenboden() + calcMantelflaeche();
    }

    public double calcVolumenDose(){
        return calcFlaecheDosenboden() * h;
    }

}
