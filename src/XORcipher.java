import java.util.Random;

public class XORcipher {
    public static String encrypt(String message){
        char [] messageChar = message.toCharArray();
        char key = randomSeriesForThreeCharacter();
        System.out.println("Your key is:"+ key);
        for (int i = 0; i <messageChar.length ; i++) {
            messageChar[i]=(char) (messageChar[i] ^ key);
        }
        return String.valueOf(messageChar);
    }
    public static String decrypt(String message, String key){
        char[] messageChar = message.toCharArray();
        char[] keyChar = key.toCharArray();
        for (int i = 0; i <messageChar.length ; i++) {
            messageChar[i]=(char) (messageChar[i] ^ keyChar[0]);
        }
        return String.valueOf(messageChar);
    }

    private static char randomSeriesForThreeCharacter() {
        Random r = new Random();
        return (char) (48 + r.nextInt(47));
    }
}
