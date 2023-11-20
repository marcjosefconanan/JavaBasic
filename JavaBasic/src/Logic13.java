//Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
//verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
public class Logic13 {
    public static void main (String[] args ){
        int x = 10;
        int y = 15;
        int num = 11;

        System.out.println("is num in range of x and y ? " + verify(x,y,num));
    }
    public static boolean verify (int x, int y, int num){
        boolean isNumInRangeOfXOrY = x <= num && num <= y;

        return isNumInRangeOfXOrY;
    }
}
