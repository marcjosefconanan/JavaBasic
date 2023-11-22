//Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.

public class Logic14 {

    public static void main (String [] args ){
        int num = 9;

        System.out.println(oddEven(num));

    }
    public static boolean oddEven (int num){
        int Mod = num %2;
        boolean even = ( Mod == 0);
        return even;
    }
}






























/*public class Logic14 {

    public static void main(String[] args) {
        int num = 7;
        System.out.println(num + " is a number " + (verify(num) ? "pari" : "dispari"));
    }

    public static boolean verify(int num) {
        return (num & 1) == 0 ? true : false;
    }
}
*/
