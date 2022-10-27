import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		int n = Integer.parseInt(entrada.nextLine());
		String[] materias = new String[n];
		for(int i=0 ; i<n ; i++)
			materias[i] = entrada.nextLine();
		System.out.println("Ciencia da Computacao");
	}
}
