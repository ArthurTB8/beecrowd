import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

         int A ;



         while (teclado.hasNext()) {
             A = teclado.nextInt();
             
             if (A == 0) {

                 System.out.println("vai ter copa!");
             } else {

                 System.out.println("vai ter duas!");
             }
         }
     }
   }
