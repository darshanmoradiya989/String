package Assignment;

import java.util.Arrays;

public class Two_string_are_permute_or_not {
    public static void main(String[] args) {
        String s1 = "abace";
        String s2 = "acabe";


        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        int[] arr = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            int ascii = s1.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            int ascii = s2.charAt(i);
            arr[ascii] = arr[ascii] - 1;
        }

        boolean isPermute = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                isPermute = false;
            }
        }

        if (isPermute) {
            System.out.println("permute");
        } else {
            System.out.println("not permute");
        }


//        char[] chars1 = s1.toCharArray();
//        char[] chars2 = s2.toCharArray();
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//
//        if (Arrays.equals(chars1,chars2)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }
}
