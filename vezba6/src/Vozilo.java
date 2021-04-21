import java.util.Objects;

public class Vozilo {
    int id;
    String model;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vozilo)) return false;
        Vozilo vozilo = (Vozilo) o;
        return id == vozilo.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
