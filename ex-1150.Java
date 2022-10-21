import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int X = entrada.nextInt();
        int Z = entrada.nextInt();
        int cont = 0;
        int soma = 0;
        while (Z <= X) {
        	Z = entrada.nextInt();
        }
        while (soma < Z) {
        	soma += X;
        	cont++;
        	X++;
        }
        System.out.println(cont);
    }
	
}
