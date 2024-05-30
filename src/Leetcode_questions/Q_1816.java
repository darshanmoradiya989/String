package Leetcode_questions;

public class Q_1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        int count = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                index = i;
                break;
            }
        }

        if (count < k) {
            index = s.length();
        }

        String newString = s.substring(0, index);

        return newString;
    }
}
