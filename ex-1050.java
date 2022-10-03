import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        
        
        int A = entrada.nextInt();
        
    
          if (A == 61) {
                
              System.out.print("Brasilia\n");  
                
            }
            
          else if (A == 71) {
              
              System.out.print("Salvador\n");
              
          }
           
           else if (A == 11) {
              
              System.out.print("Sao Paulo\n");
              
          }
          
           else if (A == 21) {
              
              System.out.print("Rio de Janeiro\n");
              
          }
          
           else if (A == 32) {
              
              System.out.print("Juiz de Fora\n");
              
          }
          
           else if (A == 19) {
              
              System.out.print("Campinas\n");
              
          }
          
           else if (A == 27) {
              
              System.out.print("Vitoria\n");
              
          }
          
           else if (A == 31) {
              
              System.out.print("Belo Horizonte\n");
              
          }
          
          else {
         
             System.out.print("DDD nao cadastrado\n");
             
          }
          
        }
    }
