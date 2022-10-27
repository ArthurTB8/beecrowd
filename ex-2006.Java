import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tipoCha = entrada.nextInt();
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		int e = entrada.nextInt();
		
		int certos = 0;
		
		if (a==tipoCha) certos++;
		if (b==tipoCha) certos++;
		if (c==tipoCha) certos++;
		if (d==tipoCha) certos++;
		if (e==tipoCha) certos++;
		
		System.out.println(certos);
	}
}
