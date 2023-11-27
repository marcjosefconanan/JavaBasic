//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e che che calcoli la somma
//dei numeri contenuti nell'array inizializzato e la stampi a video.
public class Array24 {
    public static void main(String[] args) {
        stampaSommaUnoADieci();
    }
    public static void stampaSommaUnoADieci(){
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            array[i] = i + 1;
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("la somma è : " + sum);
    }
}

