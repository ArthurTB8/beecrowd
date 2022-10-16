import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        while (numero != 2) {
            if (numero ==1) {
                int count = 0;
                double total = 0;
                while (count != 2) {
                    double x = entrada.nextDouble();
                    if (x >= 0 && x <= 10) {
                        total += x;
                        count++;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
                System.out.printf("media = %.2f\n", (total / count));
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            numero = entrada.nextInt();
        }
    }
}
