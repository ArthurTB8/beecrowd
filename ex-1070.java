import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int count = 0;
        if (x > 0) {
            while (count < 6) {
                if (x % 2 != 0) {
                    count++;
                    System.out.println(x);
                }
                x++;
            }
        }
    }
}
