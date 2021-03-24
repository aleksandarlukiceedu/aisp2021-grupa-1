package primeri;

import java.util.Arrays;

public class Student {
    public String ime;
    public String prezime;
    public String brojIndeksa;
    public int[] ocene;

    public Student(){
        this.ime = "";
        this.prezime = "";
        this.brojIndeksa = "";
        this.ocene = new int[4];
    }

    public Student(String ime, String prezime, String brojIndeksa, int[] ocene){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.ocene = ocene;
    }

    public double izracunajProsek(){
        double suma = 0;
        for (int ocena: ocene) {
            suma = suma + ocena;
        }

        return suma/ocene.length;
    }

    public void ispis(){
        double prosek = izracunajProsek();
        System.out.println();
    }

    @Override
    public String toString() {
        double prosek = izracunajProsek();
        return String.format("%1s %2s %3s %4.2f", ime, prezime, brojIndeksa, prosek);
    }
}
