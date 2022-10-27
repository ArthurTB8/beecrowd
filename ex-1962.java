import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for(int i=0 ; i<n ; i++){
			int t = entrada.nextInt();
			if(t<2015)
				System.out.println(2015-t + " D.C.");
			else
				System.out.println(t-2014 + " A.C.");
		}
	}
}
