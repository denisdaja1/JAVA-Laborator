import java.util.ArrayList;
import java.util.Scanner;

public class LibriTest {
    private static ArrayList<Libri> librat = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Shfaq te gjithe librat");
            System.out.println("2. Kerko liber");
            System.out.println("3. Shto liber");
            System.out.println("4. Hiq liber");
            System.out.println("0. Dil");
            System.out.print("Zgjedhja: ");

            int zgjedhja = scanner.nextInt();
            scanner.nextLine();

            switch (zgjedhja) {
                case 1 -> shfaqLibrat();
                case 2 -> kerkoLiber();
                case 3 -> shtoLiber();
                case 4 -> hiqLiber();
                case 0 -> {
                    System.out.println("Programi u mbyll.");
                    running = false;
                }
                default -> System.out.println("Zgjedhje e pavlefshme.");
            }
        }
    }

    private static void shfaqLibrat() {
        if (librat.isEmpty()) {
            System.out.println("Lista e librave eshte bosh.");
        } else {
            for (Libri l : librat) {
                System.out.println(l);
            }
        }
    }

    private static void kerkoLiber() {
        System.out.print("Jep ISBN e librit qe kerkon: ");
        String isbn = scanner.nextLine();
        for (Libri l : librat) {
            if (l.getIsbn().equals(isbn)) {
                System.out.println("Libri u gjet: " + l);
                return;
            }
        }
        System.out.println("Libri nuk u gjet.");
    }

    private static void shtoLiber() {
        System.out.print("Titulli: ");
        String titulli = scanner.nextLine();
        System.out.print("Autori: ");
        String autori = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Numri i faqeve: ");
        int faqe = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Lloji: ");
        String lloji = scanner.nextLine();
        System.out.print("Cmimi: ");
        double cmimi = scanner.nextDouble();
        scanner.nextLine();

        Libri l = new Libri(autori, titulli, isbn, faqe, lloji, cmimi);
        librat.add(l);
        System.out.println("Libri u shtua me sukses.");
    }

    private static void hiqLiber() {
        System.out.print("Jep ISBN e librit per te hequr: ");
        String isbn = scanner.nextLine();
        for (Libri l : librat) {
            if (l.getIsbn().equals(isbn)) {
                librat.remove(l);
                System.out.println("Libri u hoq me sukses.");
                return;
            }
        }
        System.out.println("Libri nuk u gjet.");
    }
}
