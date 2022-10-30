import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		int T = 1,N,ponta=0;
		
		while (T!=0){
			T = entrada.nextInt();
			if (T>0 && T<=100){
				for (int i=0 ; i<T ; i++){
					N = entrada.nextInt();
					if ((N-2)%2==0)
						ponta=2;
					else if ((N-1)%2==0)
						ponta=1;
					System.out.println((N-ponta)*2+ponta);
				}
			}
		}
	}
  }
