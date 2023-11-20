//Scrivere uno snippet di codice che dati 2 numeri con la virgola(double) li sommi e li stampi senza virgola (int).

public class Casting3 {

    public static void main (String [] args){

        double x = 1.5;
        double y = 1.5;

        int z = (int) (x + y);

        System.out.println("this is the sum : "+  z);
    }
}