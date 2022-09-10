import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
       
        int A,B,C,D,E;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        E = A * B - C * D;
    
        
        System.out.printf("DIFERENCA = "+E+"\n");
    }
 
}
