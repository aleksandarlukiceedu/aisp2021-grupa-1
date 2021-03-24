package primeri.geometrija;

public class Krug extends GeometrijskaFigura {
    private double poluprecnik;

    public Krug(){
    }

    public Krug(double poluprecnik){
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double izracunajPovrsinu() {
        return poluprecnik * poluprecnik * Math.PI;
    }

    @Override
    public double izracunajObim() {
        return 2 * poluprecnik * Math.PI;
    }

    public void setPoluprecnik(double poluprecnik){
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik(){
        return this.poluprecnik;
    }
}
