import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        float X = 0;
        
        float media = 0;
        
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            X = entrada.nextFloat();
            
            if (X > 0) {
                
                positivos += 1;
                
                media = media + X;
            }
            
            
        }
        
        System.out.println(positivos + " valores positivos");
        
        System.out.printf("%.1f\n", (media / positivos));

    }

}
