public class ArraylistMulti02 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix Normale:");
        stampaMatrice(matrix);

        System.out.println("\nMatrix dopo scambiato:");
        scambia(matrix);

        System.out.println("\nMatrix dopo scambiato colonne:");
        scambiaColonne(matrix);
    }

    // stampa matrice
    public static void stampaMatrice(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to swap rows
    public static void scambia(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        stampaMatrice(result);
    }

    // Method to swap columns
    public static void scambiaColonne(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        stampaMatrice(result);
    }
}
