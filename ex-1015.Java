import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double x1,x2,y1,y2,content,Dist,A;
        
        x1 = entrada.nextDouble();
         
        y1 = entrada.nextDouble();
         
        x2 = entrada.nextDouble();
         
        y2 = entrada.nextDouble();
         
        A = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
         
        Dist = Math.sqrt(A);
         
        System.out.printf("%.4f\n",Dist);

    }

}
