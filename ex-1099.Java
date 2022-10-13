import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();
           
            int soma = 0;
            if (x > y) {
                for (int j = x-1; j > y; j--) {
                    if (j % 2 != 0) soma += j;
                }
            } else if (x < y) {
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0) soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}
