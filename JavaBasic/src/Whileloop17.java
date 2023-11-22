//Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero come limite superiore e calcoli la somma di tutti i valori prima
//del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
public class Whileloop17 {
    public static void main(String[] args) {
        int limit = 10;
        additionTilTheLimit(limit);
    }
    public static void additionTilTheLimit(int limit) {
        int start = 1;
        //int sum = 0; (se vuoi la somma di tutto)
        while (start <= limit) {
            System.out.print(start);
            if (start < limit) {
                System.out.print(" + ");
            }
            //sum += start; (se vuoi la somma di tutto)
            start++;
        }
        //System.out.println(" = " + sum); (se vuoi la somma di tutto)
    }
}

