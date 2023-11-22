//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca la tabellina aritmetica di quel numero che dovrà essere
//stampata a video.
public class Forloop18 {
    public static void main(String[] args) {
        int num = 10;
        arithmeticTable(num);
    }

    public static void arithmeticTable(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}

