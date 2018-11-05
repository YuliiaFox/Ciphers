import java.util.Arrays;

final class ColumnarTransposition {
    static String encrypt(String message, String key) {
        message = message.replaceAll("\\s+", "");
        int[] order = calculateColumnOrder(key);
        char[][] table = writeMessageToTable(message, key);

        int rows = calculateRows(message, key);
        int columns = calculateColumns(key);
        String result = "";
        for (int i = 0; i < columns; i++) {
            int k = 0;
            for (; k < order.length; k++) {
                if (order[k] == i) {
                    break;
                }
            }
            for (int j = 0; j < rows; j++) {
                result = result.concat(String.valueOf(table[k][j]));
            }

        }
        return result;
    }

    public static String decrypt(String message, String key) {
        int[] order = calculateColumnOrder(key);
        char[] messageChars = message.toCharArray();
        String tmp = message.replaceAll(" ", "");
        char[][] table = new char[calculateColumns(key)][calculateRows(tmp, key)];
        for (int i = 0; i < order.length; i++) {
            int j = 0;
            for (; j < order.length; j++) {
                if (j == order[i]) {
                    break;
                }
            }
            int k = 0;
            for (int l = 0; k < messageChars.length && l !=j; k++) {
                if (32 == messageChars[k] ) {
                    l++;
                }
            }
            for (int l = k, z = 0; z< calculateRows(message,key); l++, z++) {
                table[ i][z] = messageChars[l];
            }
        }
        return new String();
    }

    private static int[] calculateColumnOrder(String key) {
        int[] order = new int[key.length()];
        char[] chars = key.toCharArray();
        char[] sortedChars = key.toCharArray();
        Arrays.sort(sortedChars);
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < sortedChars.length; j++) {
                if (sortedChars[j] == chars[i]) {
                    order[i] = j;
                    break;
                }
            }
        }
        return order;
    }

    private static char[][] writeMessageToTable(String message, String key) {

        int rows = calculateRows(message, key);
        int columns = calculateColumns(key);
        char[][] table = new char[columns][rows];

        for (int i = 0, k = 0; i < rows; i++) { //save message to 2d array(table)
            for (int j = 0; j < columns; j++, k++) {
                if (k < message.length()) {

                    table[j][i] = message.charAt(k);
                } else {
                    table[j][i] = 32;
                }
            }
        }

        return table;
    }

    private static int calculateColumns(String key) {
        return key.length();
    }

    private static int calculateRows(String message, String key) {
        return (int) Math.ceil(message.length() / (key.length() + 0.0));
    }
}
