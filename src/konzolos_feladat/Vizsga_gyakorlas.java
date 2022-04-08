package konzolos_feladat;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Vizsga_gyakorlas {

    public static void main(String[] args) {

        Harcos h1 = null, h2 = null, h3 = null, h4 = null;
        try {
            h1 = new Harcos(30, 10, "Elf");
            h2 = new Harcos(10, 10, "Manó");
            h3 = new Harcos(2, 40, "Ember");
            //h4 = new Harcos(1, 80, "O");

            h1.eszkozFelvesz(new Eszkoz("kard", 20));
            h1.eszkozFelvesz(new Eszkoz("páncél", 50));
            h1.eszkozFelvesz(new Eszkoz("lándzsa", 10));

            System.out.println("");

            System.out.println("Eszközök név szerint rendezve:");
            List<Eszkoz> eszkozok = h1.eszkozok;
            //List<Eszkoz> eszkozok = h1.getEszkozNemModosithatoLista();
            Collections.sort(eszkozok);
            for (Eszkoz eszkoz : eszkozok) {
                System.out.println(eszkoz);
            }

            System.out.println("");

            h1.eszkozEldobIndex();

            System.out.println("");

            System.out.println("Iterátor:");
            Iterator<Eszkoz> it = h1.iterator();
            for (Eszkoz eszkoz : eszkozok) {
                System.out.println(eszkoz);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
