import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, X;
        while ((A = entrada.nextInt()) != 0) {
        	B = entrada.nextInt();
        	C = entrada.nextInt();
        	X = Math.sqrt(((A * B) / C) * 100.0);
        	System.out.println((int)X);
        }
    }
	
}
