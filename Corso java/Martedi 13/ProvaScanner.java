import java.util.Scanner;

public class ProvaScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username:");
        String nome = myObj.nextLine(); 
        System.out.println("Nome: " + nome);
        myObj.close(); 
    }
} 



