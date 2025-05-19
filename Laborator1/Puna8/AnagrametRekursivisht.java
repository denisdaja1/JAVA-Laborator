public class AnagrametRekursivisht {

    public static void gjeneroAnagramat(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                gjeneroAnagramat(
                    prefix + str.charAt(i),
                    str.substring(0, i) + str.substring(i + 1)
                );
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Anagramat e fjales \"" + input + "\":");
        gjeneroAnagramat("", input);
    }
}
