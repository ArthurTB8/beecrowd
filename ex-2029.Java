import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		double pi = 3.14;
		double volume, raio, altura, diametro, area;
		
		while (entrada.hasNext()){
			volume = entrada.nextDouble();
			diametro = entrada.nextDouble();
			
			raio = diametro/2;
			area = pi*raio*raio;
			altura = volume/area;
			
			System.out.printf("ALTURA = %.2f\n", altura);
			System.out.printf("AREA = %.2f\n", area);
		}
	}
}
