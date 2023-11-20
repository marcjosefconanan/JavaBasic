//Scrivi un programma che contiene un metodo che confronti due numeri interi e determini se sono diversi.
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.

public class Comparazione11 {

    public static void main (String [] args ){
        int x = 10;
        int y = 10;

        System.out.println("are x and y equal to each other : " + verify(x,y));
    }
    public static boolean verify (int x, int y){
        boolean isXEqualToY = x==y;

        return isXEqualToY;
    }
}

