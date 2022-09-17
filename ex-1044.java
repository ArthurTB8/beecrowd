import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner entrada = new Scanner(System.in);

           
            
          int  A = entrada.nextInt();
            
          int  B = entrada.nextInt();
    
            
            if (A % B == 0 || B % A == 0){
              
              System.out.printf("Sao Multiplos\n");
                
            }else {
                
              System.out.printf("Nao sao Multiplos\n");
              
                
            } 

           
    }
 
}
