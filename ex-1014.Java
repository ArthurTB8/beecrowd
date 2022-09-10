import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
       
        
        double X,Y,A;
        
        X = teclado.nextDouble();
        
        Y = teclado.nextDouble();
        
        A  = X / Y;
        
        DecimalFormat df = new DecimalFormat("0.###");
        
        String S = df.format(A);
        
        System.out.printf(S+" km/l%n");
    

    }
 
}
