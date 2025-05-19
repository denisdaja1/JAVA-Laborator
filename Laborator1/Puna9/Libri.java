public class Libri {
    private String autori;
    private String titulli;
    private String isbn;
    private int numriFaqeve;
    private String lloji;
    private double cmimi;

    public Libri(String autori, String titulli, String isbn, int numriFaqeve, String lloji, double cmimi) {
        this.autori = autori;
        this.titulli = titulli;
        this.isbn = isbn;
        this.numriFaqeve = numriFaqeve;
        this.lloji = lloji;
        this.cmimi = cmimi;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Titulli: " + titulli + ", Autori: " + autori + ", ISBN: " + isbn +
                ", Faqe: " + numriFaqeve + ", Lloji: " + lloji + ", Cmimi: " + cmimi + "€";
    }
}
