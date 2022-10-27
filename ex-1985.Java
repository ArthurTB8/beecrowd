import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
    	int p = entrada.nextInt();
    	double total = 0;
    	int  a,b;
    	for (int i = 0; i < p; i++) {
    		a = entrada.nextInt();
    		b = entrada.nextInt();
    		switch (a) {
    			case 1001: total += b * 1.50; break;
    			case 1002: total += b * 2.50; break;
    			case 1003: total += b * 3.50; break;
    			case 1004: total += b * 4.50; break;
    			case 1005: total += b * 5.50; break;
    		}
    	}
    	System.out.println(String.format("%.2f", total));
    }
	
}
