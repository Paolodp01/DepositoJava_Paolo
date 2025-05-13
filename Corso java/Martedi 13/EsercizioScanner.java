import java.util.Scanner;

public class EsercizioScanner {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner 
        Scanner scanner = new Scanner(System.in);

        // Lettura di un numero intero
        System.out.print("Inserisci un intero: ");
        int intero = scanner.nextInt();

        // Lettura di un numero decimale
        System.out.print("Inserisci un decimale: ");
        double decimale = scanner.nextDouble();

        // Lettura di un valore booleano (true/false)
        System.out.print("Inserisci un boolean (true/false): ");
        boolean bool = scanner.nextBoolean();

        // Lettura di una stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        // Stampa dei valori letti
        System.out.println("\nValori inseriti e tipi:");
        System.out.println("Intero: " + intero + " (int)");
        System.out.println("Decimale: " + decimale + " (double)");
        System.out.println("Booleano: " + bool + " (boolean)");
        System.out.println("Stringa: " + stringa + " (String)");

        
        scanner.close();
    }
}
