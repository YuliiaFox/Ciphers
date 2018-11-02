public final class CaesarCipher {
    public static String encrypt(String message, int key) { /*зашифрувати*/
        char[] result = message.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) ((key + result[i]) % 127);
            if (result[i] < 32) {
                result[i] += 32;
            }
        }
        return new String(result);
    }

    public static String decrypt(String message, int key) {
        char[] result = message.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 65) {
                result[i] -= 32;
            }
            result[i] = (char) ((result[i] - key + 127) % 127);
        }
        return new String(result);
    }
}
