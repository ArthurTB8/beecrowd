import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
       
        String A;
        double B,C,D;
        
        A = teclado.nextLine();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        D = (C * 0.15) + B;
    
        
        System.out.printf("Total = R$ %.2f\n",+D);
    }
 
}
