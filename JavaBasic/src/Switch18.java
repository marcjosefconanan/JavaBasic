//Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione di
//algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
public class Switch18 {
    public static void main(String[] args) {
        char symbols = '+';
        identifyingSymbols(symbols);
    }
    public static void identifyingSymbols (char symbols){
        switch (symbols){
            case '+':
                System.out.println("This symbol represents: Addition");
                break;
            case '-':
                System.out.println("This symbol represents: Subtraction");
                break;
            case '*':
                System.out.println("This symbol represent: Multiplication");
                break;
            case '/':
                System.out.println("This symbol represents: Division");
                break;
            default:
                System.out.println("Error!!");
        }
    }
}
