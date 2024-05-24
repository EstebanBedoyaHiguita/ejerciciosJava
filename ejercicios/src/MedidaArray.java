public class MedidaArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        int suma = 0 ;

        for(int num : numeros){
            suma += num;

        }

        double medida = (double) suma/numeros.length;

        System.out.println("Lamedida de los elementos del array es: " + medida);
    }
}
