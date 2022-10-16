import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		double nota1 = entrada.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("nota invalida");
			nota1 = entrada.nextDouble();
		}
		
		double nota2 = entrada.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("nota invalida");
			nota2 = entrada.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		System.out.println(String.format("media = %.2f", media));
    }
	
}
