import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
       

        double R,A,pi,res;
      
        
        R = teclado.nextDouble();
        
        A = R * R * R;
      
        pi = 3.14159;
        
        res = (4 / 3.0) * (pi * A);
        
        
        
        System.out.printf("VOLUME = %.3f\n",+res);
    }
 
}
