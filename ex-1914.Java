import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = Integer.parseInt(entrada.nextLine());
		for(int i=0 ; i<n ; i++){
			String j1 = entrada.next();
			String a1 = entrada.next();
			String j2 = entrada.next();
			String a2 = entrada.next();
			int v1 = Integer.parseInt(entrada.next());
			int v2 = Integer.parseInt(entrada.next());
			String res;
			if((v1+v2)%2==0)
				res = "PAR";
			else
				res = "IMPAR";
			if(a1.equals(res))
				System.out.println(j1);
			else if(a2.equals(res))
				System.out.println(j2);
			else
				System.out.println("EMPATE");
			}
	}
}
