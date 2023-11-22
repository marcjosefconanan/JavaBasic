//Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere e
//stampi tutti i numeri naturali in ordine inverso (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi
//aspetto in uscita [6 5 4] stampati).
public class Forloop21 {
    public static void main(String[] args) {
        int max = 6;
        int getThis = 3;
        getNum(max, getThis);
    }
    public static void getNum(int max, int getThis) {
        for (int i = 0; i < getThis && max > 0; i++) {
            System.out.print(max + " ");
            max--;
        }
    }
}

