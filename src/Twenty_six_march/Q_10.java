package Twenty_six_march;

import java.util.Arrays;

public class Q_10 {
    public static void main(String[] args) {

        String s1 = "hello good morning";
        char[] chars = s1.toCharArray();

        int left = 0;
        for (int i = 0; i < chars.length; i++) {
            int current = left;
            int right = 0;
            if (chars[i] == ' ') {
                right = i - 1;
                left = i + 1;
            } else if (i == chars.length - 1) {
                right = chars.length - 1;
            }
            // reverse function
           reverse(chars,current,right);
        }

        s1 = new String(chars);
        System.out.println(s1);


//        String[] words = s1.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        for (int i = 0; i < words.length; i++) {
//            char[] chars = words[i].toCharArray();
//            System.out.println(Arrays.toString(chars));
//            int left = 0;
//            int right = chars.length - 1;
//            while (left <= right) {
//                char temp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = temp;
//                left++;
//                right--;
//            }
//            words[i] = new String(chars);
//            System.out.println(words[i]);
//        }
//        System.out.println(Arrays.toString(words));
//        s1 = "";
//        for (int i = 0; i < words.length; i++) {
//            s1 += words[i] + " ";
//        }
//
//        System.out.println(s1);

    }
    public static void reverse(char[] chars, int left, int right){
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
