import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c=0;
		
		if(a==b) c=a;
		else if(a>b) c=a;
		else c=b;
		
		System.out.println(c);

	}
}
