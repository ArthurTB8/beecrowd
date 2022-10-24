import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int T = entrada.nextInt();
        int R1, R2, R3;
        for (int i = 0; i < T; i++) {
        	R1 = entrada.nextInt();
        	R2 = entrada.nextInt();
        	R3 = R1 + R2;
        	System.out.println(R3);
        }
    }
	
}
