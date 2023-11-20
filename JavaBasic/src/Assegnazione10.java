//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
//Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
public class Assegnazione10 {
    public static void main (String[] args){
        int x = 10;
        int y = 15;
        int inc = 2;
        System.out.println("these are the original value " + "of x : "  + x + " and y : " + y);
        x += inc;
        y += inc;
        System.out.println("values increased by: " + inc);
        System.out.println("new values "+ "of x: " + x + " and y: " + y);
        System.out.println("multiplied them together: " + multiplication(x,y));
    }
    public static int multiplication (int x, int y){
        int sum = x * y;
        return sum;
    }
}
