public class MulMatrices {
    
    public static void main(String[] args) {
        int [][] matriz1 = {
            {1,2,3},
            {4,5,6}
        };

        int [][] matriz2 = {

            {7, 8},
            {9, 10},
            {11, 12}
        };

        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int columnasMatriz2 =matriz2[0].length;

        int [][] resultado = new int [filasMatriz1][columnasMatriz2];
        for (int i = 0; i < filasMatriz1; i++){
            for(int j = 0; j < columnasMatriz2; j++){
                for(int k = 0; k < columnasMatriz1; k++){
                    resultado[i][j] += matriz1[i][k] * matriz2 [k][j];
                }
            }
            System.out.println();
        }

    }
}
