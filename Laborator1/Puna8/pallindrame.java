import java.util.Scanner;

public class pallindrame {
    
    
    public static boolean eshtePalindrom(String str, int fillimi, int fundi) {
        if (fillimi >= fundi) {
            return true;
        }
        if (str.charAt(fillimi) != str.charAt(fundi)) {
            return false;
        }
        return eshtePalindrom(str, fillimi + 1, fundi - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruaj nje tekst: ");
        String input = scanner.nextLine();
        
       
        String tekst = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (eshtePalindrom(tekst, 0, tekst.length() - 1)) {
            System.out.println("Teksti eshte palindrome!");
        } else {
            System.out.println("Teksti nuk eshte palindrome.");
        }
        
        scanner.close();
    }
}
