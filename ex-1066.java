import java.io.IOException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int a, par=0, impar=0, positivo=0, negativo=0;

            for (int i=0; i<5; i++) {
                a = entrada.nextInt();
                if (a % 2 == 0) {
                    par++;
                }
                else {
                    impar++;
                }
                if (a > 0) {
                    positivo++;
                }
                if (a < 0) {
                    negativo++;
                }
            }
            System.out.println(par + " valor(es) par(es)");
            System.out.println(impar + " valor(es) impar(es)");
            System.out.println(positivo + " valor(es) positivo(s)");
            System.out.println(negativo + " valor(es) negativo(s)");
        }
     }


