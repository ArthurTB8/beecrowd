import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
       

        double A,B,C,D,E,F,G,H;
      
        
        A = teclado.nextDouble();
        
        B = teclado.nextDouble();
        
        C = teclado.nextDouble();
        
        D = (A * C) / 2;
        
        E = 3.14159 * C * C;
        
        F = (1/2.0) * (A + B) * C;
        
        G = B * B;
        
        H = A * B;
     
        
        
        System.out.printf("TRIANGULO: %.3f\n",D);
        System.out.printf("CIRCULO: %.3f\n",E);
        System.out.printf("TRAPEZIO: %.3f\n",F);
        System.out.printf("QUADRADO: %.3f\n",G);
        System.out.printf("RETANGULO: %.3f\n",+H);
    }
 
}
