package Blatt15;

public class Berechne {

    public Double rechnung(String operation, String eingabe) throws Exception {
        try{
            Double a = Double.parseDouble(eingabe);
        } catch (Exception e) {
            throw new Exception(eingabe + " ist keine Zahl!");
        }
        Double a = Double.parseDouble(eingabe);

        if(eingabe == null) throw new Exception("Falscher Aufruf! Die korrekte Form lautet:\n" +
                "    java Berechne <Funktion> <Argument>");

        switch (operation) {
            case "sin":
                return Math.sin(a);
            case "cos":
                return Math.cos(a);
            case "tan":
                return Math.tan(a);
            default:
                throw new Exception(operation + " ist keine bekannte Funktion!");
        }
    }

}
