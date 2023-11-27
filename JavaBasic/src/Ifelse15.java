//Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile,
//utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
//Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
public class Ifelse15 {

    public static void main (String []args ){
        int numToCompare = 15;
        int fizz = 3;
        int buzz = 5;
        System.out.println("This is our number " + numToCompare);
        fizzBuzz(numToCompare, fizz, buzz);
    }
    public static void fizzBuzz (int num, int fizz, int buzz){
        if (num % fizz == 0 && num % buzz == 0){
        System.out.println("FizzBuzz");
        } else
        if (num % buzz == 0){
        System.out.println("Buzz");
        } else
        if (num % fizz == 0)
        System.out.println("Fizz");
        else {
            System.out.println("It's not Fizz nor Buzz" + num);
        }
    }
}
