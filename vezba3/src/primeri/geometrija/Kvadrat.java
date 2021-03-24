package primeri.geometrija;

public class Kvadrat extends GeometrijskaFigura {
    private double stranica;

    public Kvadrat(){

    }

    public Kvadrat(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double izracunajPovrsinu() {
        return stranica * stranica;
    }

    @Override
    public double izracunajObim() {
        return 4 * stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public double getStranica(){
        return this.stranica;
    }
}
