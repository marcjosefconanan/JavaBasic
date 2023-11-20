//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e
//le moltiplichi fra di loro.


public class Aritmetici9 {
    public static void main (String[]args){
        int x = 1;
        int y = 2;
        x += 2;
        y++;
        System.out.println("this is the multiplication answer : " + multiplication(x,y));

    }
    public static int multiplication (int x, int y){
        int z = x * y;
        return z;
    }
}
