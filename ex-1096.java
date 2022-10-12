import java.io.IOException;
 
public class Main {

    public static void main(String[] args) throws IOException {
        int contador = 0;
        int sequencia = 7;
        for (int i = 1; i <= 9;) {
            System.out.println("I=" + i + " J=" + sequencia);
            sequencia--;
            contador++;
            if (contador == 3) {
                i = i + 2;
                contador = 0;
                sequencia = 7;
            }
        }
    }
}
