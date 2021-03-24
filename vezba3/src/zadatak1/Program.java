package zadatak1;

import primeri.geometrija.Kvadrat;

public class Program {

    public static void main(String[] args) {
        Koordinata k1 = new Koordinata();
        Koordinata k2 = new Koordinata(19.1, 16.3);

        System.out.println(k1);
        System.out.println(k2);

        Aerodrom a1 = new Aerodrom();
        Aerodrom a2 = new Aerodrom("Nikola Tesla", k2);
        Aerodrom a3 = new Aerodrom("JFK", new Koordinata(18.3, 22.4));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Avion av1 = new Avion("AV123", "747", "Boing", a2);
        System.out.println(av1);

        av1.obaviLet(a3);

        System.out.println(av1);

        Koordinata lokacijaAviona = av1.trenutnaLokacija();
        System.out.println(lokacijaAviona);
    }
}
