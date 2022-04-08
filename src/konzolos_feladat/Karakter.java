package konzolos_feladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Karakter {
    
    private String karakterNev, faj;
    
    final ArrayList<Eszkoz> eszkozok;

    public Karakter(String karakterNev, String faj) throws KarakterException {
        setNev(karakterNev);
        this.faj = faj;
        this.eszkozok = new ArrayList<>();
    }
    

    public String getkarakterNev() {
        return karakterNev;
    }

    public void setNev(String nev) throws KarakterException {
        if (nev.length() < 3) {
            throw new KarakterException("A név nem lehet kisebb 3 karakternél.");
        }
        this.karakterNev = nev;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }
    
    public List<Eszkoz> getEszkozNemModosithatoLista(){
        return Collections.unmodifiableList(eszkozok);
    }
    
    abstract void eszkozFelvesz(Eszkoz eszkoz);
    
    abstract void eszkozEldobIndex();
    
    abstract void eszkozEldobNev(Eszkoz eszkoz);
}