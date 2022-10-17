import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
	    
		Scanner entrada = new Scanner(System.in);

		
		int inter=0, gremio=0, somainter=0, somagremio=0, empate=0;
		int stop = 1, grenais=0;

		while (stop != 2){
			if (stop == 1){
				grenais += 1;
				inter = entrada.nextInt();
				gremio = entrada.nextInt();
				if (inter > gremio){
					somainter += 1;
				}
				else if (inter < gremio){
					somagremio = somagremio + 1;
				}
				else if (inter == gremio){
					empate += 1;
				}
				System.out.println("Novo grenal (1-sim 2-nao)");
				stop = entrada.nextInt();
			}
			if (stop == 2){
				System.out.printf("%d grenais\n",grenais);
				System.out.printf("Inter:%d\n",somainter);
				System.out.printf("Gremio:%d\n",somagremio);
				System.out.printf("Empates:%d\n",empate);
				if (somainter > somagremio){
					System.out.println("Inter venceu mais");
				}
				else{
					System.out.printf("Gremio venceu mais");
				}
			}
		}
		entrada.close();
	}
}
