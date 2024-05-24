import java.util.Scanner;


public class Suma {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1= scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();


        int suma = num1 + num2;

        System.out.println("El resultado de la suma es : " + suma);
    }
}

