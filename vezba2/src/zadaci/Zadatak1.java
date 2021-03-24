package zadaci;

public class Zadatak1 {

    public static int suma(int x1, int x2){
        return x1 + x2;
    }

    public static void inc(int x1){
        x1 = x1 + 3;
        System.out.println(x1);
    }

    public static double suma(double x1, double x2){
        return (x1+x2);
    }

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 3;
        //int x = Zadatak1.suma(x1,x2);
        //System.out.println(x);
        String s = "asdasd";
        System.out.println(Zadatak1.suma(x1, x2));
    }
}
