package recursion;

public class Program {

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumN(int n){
        if(n == 0){
            return 0;
        }

        return n + sumN(n-1);
    }

    public static int sum(int[] array, int n){
        return 0;
    }

    public static void main(String[] args) {
        int f = sumN(5);
        System.out.println(f);
    }
}