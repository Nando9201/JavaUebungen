package U3;

import Prog1Tools.IOTools;

public class Aufgaben {

    public void a1(){
        int count = IOTools.readInt("Wie viele Zahlen willst du eingeben");
        int[] zahlen = new int[count];
        for (int i = 0; i < count; i++) {
            zahlen[i] = IOTools.readInt("Zahl eingeben:");
        }

        for (int k = 0; k < count -1; k++) {
            int j = 0;
            int tmp;
            while (j < count -1){
                if(zahlen[j] > zahlen[j+1]){
                    tmp = zahlen[j];
                    zahlen[j] = zahlen[j+1];
                    zahlen[j+1] = tmp;
                }
                j++;
            }
        }
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }

    }

    public void a2(int Hoehe){
        int leerzeichen = ((Hoehe+2)/2)+1;
        int leer = leerzeichen;

        for (int i = 0; i < Hoehe; i++) {
            for (int j = 0; j < leer; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < i+1+i; k++) {
                System.out.print('*');
            }
            System.out.println();
            leer--;
        }
        leer = leerzeichen;
        for (int i = 0; i < leer; i++) {
            System.out.print(' ');
        }
        System.out.println('I');
    }

    public void a3(){
        int n = 0;
        do {
            n = IOTools.readInt("Zahle eingeben");
        }while (!checkNumber(n));

        int [] [] zahlen = new int[n][n];
        int zeile = n/2;
        int spalte = zeile + 1;

        int i = 1;
        while (i <= (n*n)){
            zahlen[zeile][spalte] = i;
            spalte++;
            zeile--;
            if(zeile < 0) zeile = n -1;
            if(spalte == n) spalte = 0;
            if(zahlen[zeile][spalte] != 0){
                zeile++;
                spalte++;
                if(zeile == n) zeile = 0;
                if(spalte == n) spalte = 0;
            }
            i++;
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(zahlen[j][k] + " ");
            }
            System.out.println();
        }

    }

    public boolean checkNumber(int i){
        if(i <= 2 || i >= 10) return false;
        if(!(i % 2 == 0)) return false;
        return true;
    }

}
