package zadatak1;

public class Avion {
    public String oznaka;
    public String model;
    public String proizdodjac;
    public Aerodrom aerodrom;

    public Avion(){
        this.oznaka = "";
        this.model = "";
        this.proizdodjac = "";
        this.aerodrom = new Aerodrom();
    }

    public Avion(String oznaka, String model, String proizdodjac, Aerodrom aerodrom){
        this.oznaka = oznaka;
        this.model = model;
        this.proizdodjac = proizdodjac;
        this.aerodrom = aerodrom;
    }

    public void obaviLet(Aerodrom aerodrom){
        this.aerodrom = aerodrom;
    }

    public Koordinata trenutnaLokacija(){
        if(this.aerodrom != null){
            return this.aerodrom.lokacija;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "oznaka='" + oznaka + '\'' +
                ", model='" + model + '\'' +
                ", proizdodjac='" + proizdodjac + '\'' +
                ", aerodrom=" + aerodrom +
                '}';
    }
}
