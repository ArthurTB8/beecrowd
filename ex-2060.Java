import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
    	int N = entrada.nextInt();
    	int L, multiplo2 = 0, multiplo3 = 0, multiplo4 = 0, multiplo5 = 0;
    	for (int i = 0; i < N; i++) {
    		L = entrada.nextInt();
    		if (L % 2 == 0) multiplo2++;
    		if (L % 3 == 0) multiplo3++;
    		if (L % 4 == 0) multiplo4++;
    		if (L % 5 == 0) multiplo5++;
    	}
    	System.out.println(multiplo2 + " Multiplo(s) de 2");
    	System.out.println(multiplo3 + " Multiplo(s) de 3");
    	System.out.println(multiplo4 + " Multiplo(s) de 4");
    	System.out.println(multiplo5 + " Multiplo(s) de 5");
    }
	
}
