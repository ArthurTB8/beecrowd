import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int N,horas,minutos,segundos;
        
        N = entrada.nextInt();
         
        horas = N / 3600;
         N = N % 3600;
         
        minutos = N / 60;
         N = N % 60;
         
         segundos = N;
         
         System.out.println(horas+ ":" +minutos+ ":" +segundos);

    }
}
