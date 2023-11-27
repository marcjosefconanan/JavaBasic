//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i
//numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
public class Advanceloop22 {
    public static void main(String[] args) {
        int num = 10;
        numbercounter(num);
    }
    public static void numbercounter(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println("value of i : " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
