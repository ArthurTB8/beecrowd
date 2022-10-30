import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int N = entrada.nextInt();
		int M = entrada.nextInt();
		
		entrada.nextLine();
		
		if (N>0 && M<500){

			String acao = "";
			int abas=N;
			for (int i=0 ; i<M ; i++){
				acao = entrada.nextLine();
				if (acao.equals("fechou"))
					abas++;
				if (acao.equals("clicou"))
					abas--;
			}
			System.out.println(abas);
		}
	}
}
