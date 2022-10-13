import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {

            Scanner entrada = new Scanner(System.in);
            
            int x,y;

            do {
                
                x = entrada.nextInt();

                y = entrada.nextInt();


                if (x > y) {
                    System.out.printf("Decrescente\n");
                } else if (y > x) {
                    System.out.printf("Crescente\n");
                }

            } while (x != y);

        }

    }
