import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase ");
        String frase = scanner.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println(fraseInvertida);
    }
}
