import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		System.out.println(frase.substring(0, N));
    }
	
}
