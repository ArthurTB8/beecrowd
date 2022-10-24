import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println("Ho!");
        	else System.out.print("Ho ");
        }
    }
	
}
