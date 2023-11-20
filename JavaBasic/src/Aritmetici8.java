//Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.
public class Aritmetici8 {
    public static void main (String[]args){
        int x = 15;
        int y = 12;
        int z = 10;

        System.out.println("this is the mean of the integers : "+ mean(x,y,z));
    }
    public static int mean (int x,int y , int z){
        int sum = x + y + z;

        int media = sum / 3;

        return media;
    }
}
