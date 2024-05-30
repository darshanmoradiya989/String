package Twenty_six_march;

import java.util.Arrays;

public class Q_8 {
    public static void main(String[] args) {
        // Print frequency of all the characters in string
        // O(n)
        String s1 = "hello";
        int[] arr = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            int ascii = s1.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = (char) i;
            if (arr[i] > 0) {
                System.out.println(c + " : " + arr[i]);
            }
        }


//         O(n2)
//        for (int i = 0; i < s1.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < s1.length(); j++) {
//                if (s1.charAt(i) == s1.charAt(j)) {
//                    count++;
//                }
//            }
//            if (!s1.substring(0, i).contains(s1.charAt(i) + "")) {
//                System.out.println(s1.charAt(i) + " : " + count);
//            }
//        }

    }
}
