import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner entrada = new Scanner(System.in);

           
            
          int  X = entrada.nextInt();
            
          int  Y = entrada.nextInt();
            
            if (X == 1){
                
              float valor = (float) Y * (float) 4.00;
              
              System.out.printf("Total: R$ %.2f\n",+valor);
                
            }else if(X == 2){
                
              float valor = (float) Y * (float) 4.50;
              
              System.out.printf("Total: R$ %.2f\n",+valor);
                
            } else if(X == 3){
                
              float valor = (float) Y * (float) 5.00;
              
              System.out.printf("Total: R$ %.2f\n",+valor);
                
            } else if(X == 4){
                
              float valor = (float) Y * (float) 2.00;
              
              System.out.printf("Total: R$ %.2f\n",+valor);
                
            } else if(X == 5){
                
              float valor = (float) Y * (float) 1.50;
              
              System.out.printf("Total: R$ %.2f\n",+valor);
                
            } else if(X <= 0 || X > 5){
                
              System.out.print("Error");
            }

           
    }
 
}
