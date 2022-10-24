import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, x, y=0, q, r;
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		if(a<0){
			x=b;
			if(b<0) x=b*-1;
			for(r=0; r<x; r++){
				y=a-r;
				if(y%b==0) break;
			}
			q=y/b;
		}
		else{
			q=a/b;
			r=a%b;
		}
		
		System.out.printf("%d %d\n",q,r);
		
		entrada.close();
	}
}
