//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e
//le moltiplichi fra di loro.


public class Aritmetici9 {
    public static void main (String[]args){
        int x = 1;
        int y = 2;
        int inc = 2;
        System.out.println("this is the multiplication answer : " + multipli(x,y,inc));
    }
    public static int multipli (int x, int y, int inc){
        int newValue1 = x + inc;
        int newValue2 = y + inc;
        int multi = newValue1 * newValue2;
        return multi;
    }
}
