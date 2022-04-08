package konzolos_feladat;

import java.util.Objects;

public class Eszkoz implements Comparable<Eszkoz> {
    
    private String nev;
    private int suly;

    public Eszkoz(String nev) {
        this.nev = nev;
        this.suly = suly;
    }
    
    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public int getSuly() {
        return suly;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nev);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eszkoz other = (Eszkoz) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }

    @Override
    public int compareTo(Eszkoz o) {
        return nev.compareTo(o.nev);
    }
    
}