import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		String numero = entrada.nextLine();
		String invertida = new StringBuilder(numero).reverse().toString();
		System.out.println(invertida);

	}
}
