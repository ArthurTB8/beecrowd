import java.io.IOException;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws IOException {



            int X, Y;

            Scanner teclado =new Scanner(System.in);



            while (true) {

                X = teclado.nextInt();
                Y = teclado.nextInt();
                int sum = 0;

                if (X <= 0 || Y <= 0 ){
                    break;
                }
                
                if (X > Y) {

                    for (Y = Y; Y <= X; Y++) {

                        sum+=Y;

                        System.out.print(Y+" ");

                    }

                    System.out.print("Sum="+sum+"\n");

                }else {

                    for (X = X; X <= Y; X++) {

                        sum+=X;

                        System.out.print(X+" ");

                    }

                    System.out.print("Sum="+sum+"\n");

                }

            }



        }



    }
    
