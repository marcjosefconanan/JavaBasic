//Scrivi un programma che contiene un metodo che confronti due caratteri e determini se sono diversi.
//Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza
public class Comparazione12 {

    public static void main (String[] args ){
        char x = 'a';
        char y = 'b';

        System.out.println("are x and y euqal : " + verify(x, y));
    }

    public static boolean verify (char x, char y){
        boolean isXEqualToY = x == y;
        return isXEqualToY;
    }
}
