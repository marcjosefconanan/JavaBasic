//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

public class Array26 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9};

            // rimuove i duplicati
            int[] risultato = duplicateRemover(array);

            System.out.println(java.util.Arrays.toString(risultato));
        }

        public static int[] duplicateRemover(int[] array) {
            int newLengthWithNoDup = 0;
            // Conta quanti elementi non duplicati ci sono nel array
            for (int i = 0; i < array.length; i++) {
                boolean duplicate = false;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    newLengthWithNoDup++;
                }
            }
            // nuovo array senza duplicati
            int[] newArrayNoDup = new int[newLengthWithNoDup];
            int indiceRisultato = 0;

            // Copia  elementi non duplicati
            for (int i = 0; i < array.length; i++) {
                boolean duplicate = false;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    newArrayNoDup[indiceRisultato] = array[i];
                    indiceRisultato++;
                }
            }

            return newArrayNoDup;
        }
    }

