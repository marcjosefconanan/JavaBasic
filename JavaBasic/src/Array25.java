//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
//Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.
public class Array25 {
        public static void main(String[] args) {
            char[] characters = createArray();
            printA(characters);
        }
        public static char[] createArray() {
            char[] newArray = {'a', 'b', 'c', 'd', 'e', 'f', 'a', 'a', 'a', 'a'};
            return newArray;
        }
        public static void printA(char[] array) {
            int aConter = 0;

            for (int i = 0; i < array.length; i++) {
                char character = array[i];
                if (character == 'a') {
                    aConter++;
                }
            }
            if (aConter > 0) {
                System.out.println("'a' appare " + aConter + " volte");
            } else {
                System.out.println("a non c'è");
            }
        }
    }

