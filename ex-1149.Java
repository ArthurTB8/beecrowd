import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int N = entrada.nextInt();
        int soma = 0;
        while (N <= 0) {
        	N = entrada.nextInt();
        }
        for (int i = 1; i <= N; i++) {
        	soma += A;
        	A++;
        }
        System.out.println(soma);
    }
	
}
