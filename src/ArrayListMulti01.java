public class ArrayListMulti01 {

    public static void main(String[] args) {
        int[][] matrice = inizializzaMatrice();

        System.out.println("Matrice:");
        stampaMatrice(matrice);

        int somma = sommaPrimaRiga(matrice);
        System.out.println("\nSomma degli elementi nella prima riga: " + somma);
    }

    // Metodo per inizializzare la matrice con valori a piacimento
    public static int[][] inizializzaMatrice() {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        return matrice;
    }

    // Metodo per stampare la matrice
    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Metodo per calcolare la somma degli elementi nella prima riga
    public static int sommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int j = 0; j < matrice[0].length; j++) {
            somma += matrice[0][j];
        }
        return somma;
    }
}