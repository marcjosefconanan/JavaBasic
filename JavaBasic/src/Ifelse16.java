//Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
//"Lunghezza minore di 10" o "Lunghezza pari a 10".
public class Ifelse16 {
    public static void main (String[]args){
        String words = "This is a String!!";
        System.out.println("This is the String length: " + words.length());
        lengthDetector(words);
    }
    public static void lengthDetector (String words){
        if (words.length() == 10){
            System.out.println("Lunghezza pari a 10");
        }else if (words.length() > 10){
            System.out.println("Lunghezza maggiore di 10");
        }else {
            System.out.println("Lunghezza minore di 10");
        }
    }
}
