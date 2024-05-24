import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

       boolean isPrimo = true;

       if(num <= 1){
         isPrimo = false;
       }else{
        for( int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrimo = false;
            }
        }

        if(isPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
          }
   }

       
}