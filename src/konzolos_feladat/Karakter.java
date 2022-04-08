package konzolos_feladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Karakter extends Eszkoz {
    
    private String karakterNev, faj;
    
    final ArrayList<Eszkoz> eszkozok;

    public Karakter(String nev, int suly) {
        super(nev, suly);
        this.eszkozok = new ArrayList<>();
    }

    public String getkarakterNev() {
        return karakterNev;
    }

    public void setNev(String nev) {
        this.karakterNev = nev;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }
    
    void kivetelkezeles() throws KarakterException {
        if (karakterNev.length() < 3) {
            throw new KarakterException("A név nem lehet kisebb 3 karakternél.");
        }
    }
    
    public List<Eszkoz> getEszkozNemModosithatoLista(){
        return Collections.unmodifiableList(eszkozok);
    }
    
    abstract void eszkozFelvesz(Eszkoz eszkoz);
    
    abstract void eszkozEldobIndex();
    
    abstract void eszkozEldobNev(Eszkoz eszkoz);
}