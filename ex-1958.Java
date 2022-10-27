import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
		Scanner entrada = new Scanner(System.in);
		
		double X = entrada.nextDouble();
		
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
    }
	
}
