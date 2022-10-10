import java.io.IOException;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws IOException {
            Scanner entrada = new Scanner(System.in);
            int a;
            int cont = 0;
            for (int i = 0; i < 5; i++) {
                a = entrada.nextInt();
                if (a % 2 == 0 ) cont++;
            }
            System.out.println(cont + " valores pares");
        }

    }

