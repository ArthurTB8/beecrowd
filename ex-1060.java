import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        float X;
        
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            X = entrada.nextFloat();
            
            if (X > 0) {
                
                positivos += 1;
            }
        }
        
        System.out.println(positivos + " valores positivos");

    }

}
