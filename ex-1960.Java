import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int[] numArabico = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String[] numRomana = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int N = leitor.nextInt();
    	int i = 0;
    	while (N > 0) {
    		if (N >= numArabico[i]) {
    			System.out.print(numRomana[i]);
    			N -= numArabico[i];
        	} else {
        		i++;
        	}
        }
    	System.out.print("\n");
    }
	
}
