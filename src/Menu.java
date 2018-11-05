public class Menu {
    public static void main(String[] args) {
        System.out.println(ColumnarTransposition.encrypt("WE ARE DISCOVERED FLEE AT ONCE", "ZEBRAS"));
        System.out.println(ColumnarTransposition.decrypt("EVLN ACDT ESEA ROFO DEEC WIREE", "ZEBRAS"));
        System.out.println(XORcipher.encrypt("WE ARE DISCOVERED FLEE AT ONCE"));
        System.out.println(XORcipher.decrypt("l~zi~rhxtm~i~}w~~zotux~", ";"));
    }

}
