import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int C = entrada.nextInt();
		for(int i=0 ; i<C ; i++){
			int n = entrada.nextInt();
				if(n%2==0){
				
				System.out.println("0");
				}
				else{
				
				System.out.println("1");
				}
		}
	}
}
