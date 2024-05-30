package Leetcode_questions;

public class Q_2810 {
    public static void main(String[] args) {
        String s = "poiinter";
        System.out.println(finalString(s));
    }

    public static String finalString(String s) {

//        2ms runtime
//        int n = s.length();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            if (s.charAt(i) == 'i') {
//                sb.reverse();
//            } else {
//                sb.append(s.charAt(i));
//            }
//        }
//
//        return sb.toString();


//      3ms runtime
        StringBuilder newString = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i') {
                int left = 0;
                reverse(chars,left, i);
            }
        }

        s = new String(chars);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                newString.append(s.charAt(i));
            }
        }

        return newString.toString();


    }
    public static void reverse(char[] chars, int left, int right){
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
