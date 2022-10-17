import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        if(A>B){
            int temp = A;
            A = B;
            B = temp;
        }
        for (int i = A; i <= B; i++) {
            if(i%13!=0){
                total+=i;
            }
        }
        System.out.println(total);
    }
}
