import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double porcnt = ((b-a)*100)/a;
		System.out.printf("%.2f%%\n",porcnt);
	}
}
