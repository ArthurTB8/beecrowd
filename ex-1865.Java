import java.util.Scanner;
import java.util.Locale;


public class Main {
	public static void main(String[] args) {
	
	
		Scanner entrada = new Scanner(System.in);
		
		int x = Integer.parseInt(entrada.nextLine());
		
		for(int i=0 ; i<x ; i++){
			String nome = entrada.next();
			int n = Integer.parseInt(entrada.next());
			if(nome.equals("Thor"))
				System.out.println("Y");
			else
				System.out.println("N");
		}
	}
}
