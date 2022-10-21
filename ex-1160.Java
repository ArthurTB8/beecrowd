import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int t=1, ANOS;
		int PA, PB;
		double G1, G2;
		
		t = entrada.nextInt();
		while (t > 0) {

			PA = entrada.nextInt();
			PB = entrada.nextInt();
			G1 = entrada.nextDouble();
			G2 = entrada.nextDouble();
			
			ANOS = 0;
			
			while (PA <= PB){
				
				PA+= PA*(G1/100.0);
				PB+= PB*(G2/100.0);

				ANOS++;
				
				if (ANOS > 100){
					System.out.println("Mais de 1 seculo.");
					PA=PB+1;
				}
			}
			if (ANOS <= 100)
				System.out.printf("%d anos.\n",ANOS);
			
			t = t - 1;
			
		}
		entrada.close();
	}
}
