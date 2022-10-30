import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
	
		int C = Integer.parseInt(entrada.nextLine());
		
		for(int i=0 ; i<C ; i++){
			String galop = entrada.nextLine();
			Double resultado = (double)galop.length() * 0.01;
			System.out.printf("%.2f\n",resultado);
		}
	}
}
