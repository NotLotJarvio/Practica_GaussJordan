public class GaussJordan {

    public static void resolver(double[][] matriz) {
        int n = matriz.length;

        // 1. Reutilización del módulo anterior (Triangulación superior)
        Gauss.eliminacionGaussiana(matriz);

        // 2. Normalización y barrido superior
        for (int i = n - 1; i >= 0; i--) {
            // Normalización del pivote para convertirlo en 1
            double pivote = matriz[i][i];
            for (int j = i; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Eliminación de coeficientes superiores (Barrido hacia arriba)
            for (int k = i - 1; k >= 0; k--) {
                double factor = matriz[k][i];
                for (int j = i; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double val : fila) {
                System.out.printf("%8.3f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imprimirSolucion(double[][] matriz) {
        int n = matriz.length;
        System.out.println("Vector de soluciones (Lectura directa):");
        for (int i = 0; i < n; i++) {
            // Las soluciones quedan despejadas automáticamente en la última columna
            System.out.printf("x%d = %.3f\n", (i + 1), matriz[i][n]);
        }
    }
}