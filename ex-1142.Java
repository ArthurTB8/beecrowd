import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int cont = 1;
		for (int i = 0; i < numero; i++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM");
			cont++;
		}
    }
	
}
