package primeri;

import primeri.geometrija.GeometrijskaFigura;
import primeri.geometrija.Krug;
import primeri.geometrija.Kvadrat;

public class Program {

    public static void main(String[] args) {
        GeometrijskaFigura[] geoFigure = new GeometrijskaFigura[4];

        Kvadrat kv = new Kvadrat(2);
        Kvadrat kv1 = new Kvadrat(5);

        Krug krug = new Krug(0.5);
        Krug krug1 = new Krug(0.75);

        geoFigure[0] = kv;
        geoFigure[1] = krug;
        geoFigure[2] = kv1;
        geoFigure[3] = krug1;

        for (GeometrijskaFigura go: geoFigure) {
            double obim = go.izracunajObim();
            double porsina = go.izracunajPovrsinu();

            System.out.print(go);
            System.out.println(" Obim je: " + obim + ", Povrsina je: " + porsina);
        }
    }
}
