package Twenty_six_march;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q_2 {
    public static void main(String[] args) {
        // Reverse a String in memory

        String s1 = "hello good morning";
        char[] chars = s1.toCharArray();
        int start = 0, end = chars.length - 1;

        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        s1 = new String(chars);
        System.out.println(s1);

    }
}
