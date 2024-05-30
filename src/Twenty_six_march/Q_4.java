package Twenty_six_march;

import java.util.Arrays;

public class Q_4 {
    public static void main(String[] args) {
      //  count number of words in a String (with / without split function)
        // using split
        String s1 = "hello good morning";
        String[] words = s1.split(" ");

        System.out.println(words.length);


        // without using split
        int count = 1;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);


    }
}
