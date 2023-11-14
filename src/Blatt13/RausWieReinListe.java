package Blatt13;

public class RausWieReinListe implements WarteListe{

    Patient[] patienten = new Patient[1000];

    int aktuellerPatient = 0, anzahlPatienten = 0;
    @Override
    public void rein(Patient p) {

        patienten[anzahlPatienten] = p;
        anzahlPatienten++;
    }

    @Override
    public Patient raus() {
        return patienten[aktuellerPatient++];

    }
}
