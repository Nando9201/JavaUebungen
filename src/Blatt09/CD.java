package Blatt09;

public class CD {

    private String Titel;

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public int getSpieldauer() {
        return Spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        Spieldauer = spieldauer;
    }

    public boolean isAusgeliehen() {
        return Ausgeliehen;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        Ausgeliehen = ausgeliehen;
    }

    private int Spieldauer;

    private boolean Ausgeliehen;

    public CD(String titel, int spieldauer, boolean ausgeliehen) {
        Titel = titel;
        Spieldauer = spieldauer;
        Ausgeliehen = ausgeliehen;
    }

    public String toString(){
        return Titel + "( " + Spieldauer + " Minuten )";
    }
}
