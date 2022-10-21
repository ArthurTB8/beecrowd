import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
		}
    }
	
}
