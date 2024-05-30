package Leetcode_questions;

public class Q_1844 {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";

        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        // solution 1
        StringBuilder result = new StringBuilder();

        int i;
        for (i = 1; i < s.length(); i += 2) {
            result.append(s.charAt(i - 1));
            result.append((char) (s.charAt(i - 1) + s.charAt(i) - '0'));
        }

        if (i == s.length()) {
            result.append(s.charAt(s.length() - 1));
        }


        return result.toString();

//         solution 2
//
//        char[] arr=s.toCharArray();
//
//        for (int i = 1; i < arr.length; i+=2) {
//            arr[i]+= (char) (arr[i-1]-'0');
//        }
//        return new String(arr);
    }

}
