//Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza
public class Funzioni6 {

    public static void main (String[] args ){
        String length = "apple";
        System.out.println(lengthOfTheString(length));
    }
    public static int lengthOfTheString (String length){
        int stringLength = length.length();

        return stringLength;
    }
}
