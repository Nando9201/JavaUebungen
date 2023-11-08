package Blatt09;

import Prog1Tools.IOTools;

public class Party {

    public static void einlesen (CD[] cdf){
        for (int i = 0; i < cdf.length; i++) {
            cdf[i] = createCD();
        }
    }

    public static void sortieren (CD[] cdf){
        int tmpLenght;
        int tmpIndex;
        CD tmpCD;

        for (int i = 0; i < cdf.length-2; i++) {
            tmpLenght = cdf[0].getSpieldauer();
            tmpIndex = 0;
            for (int j = 1; j < cdf.length; j++) {
                if(tmpLenght < cdf[j].getSpieldauer()){
                    tmpLenght = cdf[j].getSpieldauer();
                    tmpIndex = j;
                }
            }
            tmpCD = cdf[i];
            cdf[i] = cdf[tmpIndex];
            cdf[tmpIndex] = tmpCD;

        }
    }

    public static void vorhandeneAusgeben (CD[] cdf){
        for (CD aktuelleCD: cdf
             ) {

            if(!aktuelleCD.isAusgeliehen()){
                System.out.println(aktuelleCD.toString());
            }

        }
    }


    private static CD createCD(){
        return new CD(
                IOTools.readString("Titel: "),
                IOTools.readInt("Dauer: "),
                IOTools.readBoolean("Ausgeliehen: ")
        );
    }
}
