import java.util.ArrayList;

public class Prona {
    private String emriPrones;
    private ArrayList<Klient> klientet;

    public Prona(String emriPrones) {
        this.emriPrones = emriPrones;
        this.klientet = new ArrayList<>();
    }

    public void shtoKlient(Klient k) {
        klientet.add(k);
    }

    public int numeroKlient() {
        return klientet.size();
    }

    public Klient ofertaMaks() {
        if (klientet.isEmpty()) return null;

        Klient max = klientet.get(0);
        for (Klient k : klientet) {
            if (k.getOferta() > max.getOferta()) {
                max = k;
            }
        }
        return max;
    }

    public String toString() {
        return "Prona: " + emriPrones + ", Kliente: " + numeroKlient();
    }
}
