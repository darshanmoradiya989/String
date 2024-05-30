package Twenty_six_march;

import java.util.Arrays;

public class Q_7 {
    public static void main(String[] args) {
        //Sort string of characters
        String s1 = "hello amc";
        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < chars.length - i - 1; j++){
                if (chars[j] > chars[j + 1]){
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        System.out.println(chars);

    }
}
