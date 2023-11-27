//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i
//numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.
public class Advanceloop23 {
    public static void main(String[] args) {
        int num = 10;
        numberCounter(num);
    }
    public static void numberCounter (int num){
        for (int i = 0;i <= num;i++){
            if (i == 5){
                continue;
            }
            System.out.println("Value of i: " + i);
        }
    }
}
