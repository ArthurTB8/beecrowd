import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int n = entrada.nextInt();
        int y[] = new int[n];
       
        int dentro = 0, fora = 0;
        for (int i = 0; i < y.length; i++) {
            y[i] = entrada.nextInt();
            if (y[i] >= 10 && y[i] <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
       
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}
