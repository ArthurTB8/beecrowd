import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
     	Scanner entrada = new Scanner(System.in);
	
		int A = entrada.nextInt();
		
		for (int i = 0; i < A; i++) {
		    
		    
			String frase = checarlinha(entrada);
			
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			
			parte1.reverse();
			
			parte2.reverse();
			
			System.out.println(parte1.toString() + parte2.toString());
		}
	}
	
	public static String checarlinha(Scanner entrada) {
	    
		String dadosLinha = entrada.nextLine();
		
		while (dadosLinha.isEmpty())
		
			dadosLinha = entrada.nextLine();
			
		return dadosLinha;
		
	}
	
}
