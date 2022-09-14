import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;



public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double valorInf = input.nextDouble();
        double valor = 0;



        System.out.println("NOTAS:");

        valor =  valorInf /  100;
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Math.floor(valor));
        valorInf =  valorInf % 100;

        valor = valorInf / 50;
        System.out.printf("%.0f nota(s) de R$ 50.00\n" , Math.floor(valor));
        valorInf =  valorInf % 50;

        valor =   valorInf / 20;
        System.out.printf("%.0f nota(s) de R$ 20.00\n" , Math.floor(valor));
        valorInf =  valorInf % 20;

        valor =   valorInf / 10;
        System.out.printf("%.0f nota(s) de R$ 10.00\n" , Math.floor(valor));
        valorInf =  valorInf % 10;

        valor =  valorInf / 5;
        System.out.printf("%.0f nota(s) de R$ 5.00\n" , Math.floor(valor));
        valorInf = valorInf % 5;

        valor =   valorInf / 2;
        System.out.printf("%.0f nota(s) de R$ 2.00\n" , Math.floor(valor));
        valorInf =  valorInf % 2;


        System.out.println("MOEDAS:");

        valor =   valorInf / 1;
        valorInf =  valorInf % 1.0;
        System.out.printf("%.0f moeda(s) de R$ 1.00\n",Math.floor(valor));

        valor =   valorInf / 0.5;
        valorInf = valorInf % 0.5;
        System.out.printf("%.0f moeda(s) de R$ 0.50\n",Math.floor(valor));


        valor =  valorInf / 0.25;
        valorInf = valorInf % 0.25;
        System.out.printf("%.0f moeda(s) de R$ 0.25\n",Math.floor(valor));



        valor =  valorInf / 0.1;
        valorInf = valorInf % 0.1;
        System.out.printf("%.0f moeda(s) de R$ 0.10\n",Math.floor(valor));



        valor =  valorInf / 0.05;
        valorInf = valorInf % 0.05;
        System.out.printf("%.0f moeda(s) de R$ 0.05\n",Math.floor(valor));



        valor =  valorInf / 0.01;
        System.out.printf("%.0f moeda(s) de R$ 0.01\n",Math.floor(valor));


    }

}
