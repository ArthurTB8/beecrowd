import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int N, menor,pos=0;
		N = entrada.nextInt();
		int[] T = new int[N];
		
		for (int i=0 ; i<N ; i++)
			T[i] = entrada.nextInt();
		
		menor=T[0];
		for (int i=0 ; i<N ; i++)
			if (menor > T[i]){
				menor=T[i];
				pos=i;
			}
		
		System.out.println(pos+1);
		entrada.close();
	}
}
