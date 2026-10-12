public class Main {
    public static void main(String[] args) {
        // Ejemplo de sistema de ecuaciones:
        //  2x +  y -  z =   8
        // -3x -  y + 2z = -11
        // -2x +  y + 2z =  -3
        double[][] matrizAumentada = {
                { 2,  1, -1,   8},
                {-3, -1,  2, -11},
                {-2,  1,  2,  -3}
        };

        System.out.println("--- Método de Gauss-Jordan ---");
        System.out.println("Matriz Original:");
        GaussJordan.imprimirMatriz(matrizAumentada);

        // Ejecución del algoritmo
        GaussJordan.resolver(matrizAumentada);

        System.out.println("Matriz Identidad Resultante:");
        GaussJordan.imprimirMatriz(matrizAumentada);

        // Imprimir resultados
        GaussJordan.imprimirSolucion(matrizAumentada);
    }
}
