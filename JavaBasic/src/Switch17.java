//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno della settimana
//come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
public class Switch17 {
    public static void main(String[] args) {
        int num = 8;
        numbersCorrespondingToDays(num);
    }

    public static void numbersCorrespondingToDays(int num) {
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error!!");
                break;
        }
    }
}

