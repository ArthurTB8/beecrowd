import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
           int a, b;
           a = entrada.nextInt();

        for (int i=0; i<a; i++) {
            b = entrada.nextInt();
            if (b == 0) {
                System.out.println("NULL");
            }
            else {
            if (b % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }
            if (b > 0) {
                System.out.println("POSITIVE");
            }
            else {
                System.out.println("NEGATIVE");
            }}
        }
    }
}
