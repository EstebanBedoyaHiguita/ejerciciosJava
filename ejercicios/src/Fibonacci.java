import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Serie de finonnaci:" + a + "" + b );

        for(int i = 2; i < num; i++){
            int c = a+b;
            System.out.println("" + c);
            a=b;
            b=c;
        }

    }
}
