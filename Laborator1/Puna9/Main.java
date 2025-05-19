import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FigureGjeometrike> figurat = new ArrayList<>();

        System.out.print("Jep numrin e figurave: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nZgjidh nje figure:");
            System.out.println("1. Rreth");
            System.out.println("2. Drejtkendeshi");
            System.out.println("3. Trekendeshi");
            System.out.print("Zgjedhja: ");
            int zgjedhja = sc.nextInt();

            switch (zgjedhja) {
                case 1 -> {
                    System.out.print("Rreze: ");
                    double r = sc.nextDouble();
                    figurat.add(new Rreth(r));
                }
                case 2 -> {
                    System.out.print("Gjatesia: ");
                    double gj = sc.nextDouble();
                    System.out.print("Gjeresia: ");
                    double gjer = sc.nextDouble();
                    figurat.add(new Drejtkendeshi(gj, gjer));
                }
                case 3 -> {
                    System.out.print("Brinja a: ");
                    double a = sc.nextDouble();
                    System.out.print("Brinja b: ");
                    double b = sc.nextDouble();
                    System.out.print("Brinja c: ");
                    double c = sc.nextDouble();
                    Trekendeshi t = new Trekendeshi(a, b, c);
                    if (t.eshteValid()) {
                        figurat.add(t);
                    } else {
                        System.out.println("Brinjet nuk formojne nje trekendesh te vlefshem!");
                        i--; 
                    }
                }
                default -> {
                    System.out.println("Zgjedhje e pavlefshme.");
                    i--; 
                }
            }
        }

        FigureGjeometrike maxFigura = null;
        double maxPerimetri = 0;

        for (FigureGjeometrike f : figurat) {
            double p = f.llogaritPerimeter();
            if (p > maxPerimetri) {
                maxPerimetri = p;
                maxFigura = f;
            }
        }

        System.out.println("\nFigura me perimetrin me te madh:");
        if (maxFigura != null) {
            System.out.println(maxFigura + " -> Perimeter: " + maxPerimetri);
        }
    }
}
