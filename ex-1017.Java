import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int X,Y;
        
        double A,B;
        
        X = entrada.nextInt();
         
        Y = entrada.nextInt();
         
        A = X * Y;
        
        B = A / 12;
         
        System.out.printf("%.3f\n", B);

    }

}
