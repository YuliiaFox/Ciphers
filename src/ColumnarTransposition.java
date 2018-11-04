import java.util.Arrays;

final class ColumnarTransposition {
    static String encrypt(String message, String key) {
        message = message.replaceAll("\\s+", "");
        int rows = (int) Math.ceil(message.length() / (key.length() + 0.0));
        int columns = key.length();
        char[][] table = new char[columns][rows];

        for (int i = 0, k = 0; i < rows; i++) { //save message to 2d array(table)
            for (int j = 0; j < columns; j++, k++) {
                if (k < message.length())
                table[j][i] = message.charAt(k);
            }
        }
        int[] order = calculateColumnOrder(key);

       int[][] result = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            //result[i][] = message;
        }
        return new String();
    }
    /*public static String decrypt(String message, int key){

    }*/

    private static int[] calculateColumnOrder(String key) {
        int[] order = new int[key.length()];
        char[] chars = key.toCharArray();
        char[] sortedChars = key.toCharArray();
        Arrays.sort(sortedChars);
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < sortedChars.length; j++) {
                if (sortedChars[j] == chars[i]) {
                    order[i] = j;
                }
                break;
            }
        }
        return order;
    }
}
