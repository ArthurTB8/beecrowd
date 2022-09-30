import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        
        
        float A = entrada.nextFloat();

         if ( A >= 0 || A <= 400) {
             
         float reajuste = A * 0.15f;
           
         float  novoSalario = reajuste + A;
         
         
         System.out.printf("Novo salario: %.2f\n",novoSalario);
           
         System.out.printf("Reajuste ganho: %.2f\n",reajuste);
             
         System.out.printf("Em percentual: 15 %%");
           
           
        } 
        else if ( A >= 400.01 || A <= 800) {
        
         float reajuste = A * 0.12f;
            
         float  novoSalario = reajuste + A;
         
         
         System.out.printf("Novo salario: %.2f\n",novoSalario);
           
         System.out.printf("Reajuste ganho: %.2f\n",reajuste);
             
         System.out.printf("Em percentual: 12 %%");
           
        }
         else if ( A >= 800.01 || A <= 1200) {
            
         float reajuste = A * 0.10f;
           
         float  novoSalario = (A * 0.10f) + A;
         
         
         System.out.printf("Novo salario: %.2f\n",novoSalario);
           
         System.out.printf("Reajuste ganho: %.2f\n",reajuste);
             
         System.out.printf("Em percentual: 10 %%");
           
        }
         else if ( A >= 1200.01 || A <= 2000) {
           
         float reajuste = A * 0.07f;
           
         float  novoSalario = reajuste + A;
         
         
         System.out.printf("Novo salario: %.2f\n",novoSalario);
           
         System.out.printf("Reajuste ganho: %.2f\n",reajuste);
             
         System.out.printf("Em percentual: 7 %%");
           
           
        }
         else if (  A <= 2000.01) {
            
          float reajuste = A * 0.04f;
        
          float  novoSalario = reajuste + A;
          
          
          System.out.printf("Novo salario: %.2f\n",novoSalario);
           
          System.out.printf("Reajuste ganho: %.2f\n",reajuste);
             
          System.out.printf("Em percentual: 4 %%");
        }

      

    }
}
