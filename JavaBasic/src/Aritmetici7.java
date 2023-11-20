//Definisci un metodo per la divisione di 2 numeri interi che restituisca il quoziente che dovrà essere stampato.
public class Aritmetici7 {
    public static void main (String[] args ){
        int x = 10;
        int y = 2;

        System.out.println("this is the Quotient : "  +  returnQuotient(x,y));
    }
    public static int returnQuotient(int x, int y){
        int z = x / y ;

        return z;
    }
}
