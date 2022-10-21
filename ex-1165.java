import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int n, x, testasoma=0;
		
		n = entrada.nextInt();
		while (n > 0) {

			x = entrada.nextInt();
			for (int aux = 2; aux < x; aux++){
				if (x % aux == 0){
					testasoma+=aux;
				}
			}
			if (testasoma == 0){
				System.out.printf("%d eh primo\n",x);
			}
			else {
				System.out.printf("%d nao eh primo\n",x);
			}
			n = n - 1;
			testasoma = 0;
		}
	}
}
