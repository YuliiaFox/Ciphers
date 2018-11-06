public class Menu {
    public static void main(String[] args) {
        System.out.println("Caesar Cipher:");
        System.out.println(CaesarCipher.encrypt("WE ARE DISCOVERED FLEE AT ONCE", 3));
        System.out.println(CaesarCipher.decrypt("ZH#DUH#GLVFRYHUHG#IOHH#DW#RQFH", 3));
        System.out.println("Columnar Transposition:");
        System.out.println(ColumnarTransposition.encrypt("WE ARE DISCOVERED FLEE AT ONCE", "ZEBRAS"));
        System.out.println(ColumnarTransposition.decrypt("EVLN ACDT ESEA ROFO DEEC WIREE", "ZEBRAS"));
        System.out.println("XOR cipher:");
        System.out.println(XORcipher.encrypt("WE ARE DISCOVERED FLEE AT ONCE"));
        System.out.println(XORcipher.decrypt("l~zi~rhxtm~i~}w~~zotux~", ";"));
    }

}
