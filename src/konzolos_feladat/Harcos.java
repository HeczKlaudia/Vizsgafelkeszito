package konzolos_feladat;

import java.util.Iterator;

public class Harcos extends Karakter implements Iterable<Eszkoz>{

    private int ero, ugyesseg;

    public Harcos(String nev, int suly) {
        super(nev, suly);
    }

    @Override
    void eszkozFelvesz(Eszkoz eszkoz) {
        eszkozok.add(eszkoz);
        System.out.println("Felvetted az eszközt.");
    }

    @Override
    void eszkozEldobIndex() {
        for (int i = 0; i < eszkozok.size(); i++) {
            eszkozok.get(i);
            if (i == eszkozok.size() - 1) {
                eszkozok.remove(i);
                System.out.println("Eldobtad az utolsó felvett eszközt.");
            }
        }
    }

    @Override
    void eszkozEldobNev(Eszkoz nev) {
        for (Eszkoz eszkoz : eszkozok) {
            if (eszkoz.equals(nev)) {
                eszkozok.remove(eszkoz);
                System.out.println("Eldobtad az eszközt.");
            } else {
                System.out.println("Az eszközt nem sikerült eldobni, vagy nincs a kezedben.");
            }
        }
    }

    @Override
    public Iterator<Eszkoz> iterator() {
        return eszkozok.iterator();
    }

}
