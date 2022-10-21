import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int cont = 1;
		for (int i = 1; i <= B; i++) {
			System.out.print(i);
			if (i % A == 0) System.out.println("");
			else System.out.print(" ");

		}
    }
	
}
