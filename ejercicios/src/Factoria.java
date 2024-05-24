import java.util.Scanner;

public class Factoria {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero:");
        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; 1 <= num; i++){
            factorial *= i;
        }
        System.out.println("El factoria de " + num + " es" + factorial);
    }
}
