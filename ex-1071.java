import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();
       
        int soma = 0;
       
        if (x > y) {
            for (int i = x-1; i > y; i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
           for (int i = x; i < y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
       
        System.out.println(soma);

    }
}
