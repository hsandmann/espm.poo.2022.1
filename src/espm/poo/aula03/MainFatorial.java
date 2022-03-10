package espm.poo.aula03;

public class MainFatorial {

    public static void main(String[] args) {
        System.out.println(fatorial1(5));
    }
    
    public static int fatorial1(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    public static int fatorial2(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial2(n - 1);
        // return (n <= 1) ? 1 : n * fatorial2(n - 1);
    }

}
