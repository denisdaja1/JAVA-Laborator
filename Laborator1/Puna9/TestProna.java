public class TestProna {
    public static void main(String[] args) {
        Prona prona = new Prona("Apartament Tirane");

        prona.shtoKlient(new Klient("Ardian", 105000));
        prona.shtoKlient(new Klient("Elira", 110000));
        prona.shtoKlient(new Klient("Bledi", 98000));

        System.out.println("Numri i klienteve te interesuar: " + prona.numeroKlient());

        Klient meIMire = prona.ofertaMaks();
        if (meIMire != null) {
            System.out.println("Klienti me oferten me te larte: " + meIMire);
        }
    }
}
