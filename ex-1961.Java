import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int P = leitor.nextInt();
    	int N = leitor.nextInt();
    	int pulos[] = new int[N];
    	boolean WIN = true;
    	
    	for (int i = 0; i < N; i++) {
    		pulos[i] = leitor.nextInt();
    	}
    	
    	for (int i = 0; i < (N-1); i++) {
    		if ((pulos[i] - pulos[i+1]) < (-P)) WIN = false;
    		else if ((pulos[i] - pulos[i+1]) > P) WIN = false; 
    	}
    	
    	if (WIN) System.out.println("YOU WIN");
    	else System.out.println("GAME OVER");
    }
	
}
