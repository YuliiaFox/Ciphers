import java.util.Arrays;

public final class ColumnarTransposition {
    public static String encrypt(String message,String  key){
        int rows = (int) Math.ceil(message.length()/key.length());
        int columns = key.length();
        char [][] table = new char[rows][columns];

        for (int i = 0, k=0; i < columns; i++) {
            for (int j = 0; j <rows ; j++, k++) {
                table[j][i] = message.charAt(k);
            }
        }

    }
    public static String decrypt(String message, int key){

    }

    private int[] calculateColumnOrder(String key){
        int[] order = new int[key.length()];
        char [] chars =key.toCharArray();
        char[] sortedChars = key.toCharArray();
        Arrays.sort(sortedChars);
        for (int i = 0; i <order.length; i++) {
            for (int j = 0; j <sortedChars.length ; j++) {
                if (sortedChars[j] == )
            }
        }
    }
}

