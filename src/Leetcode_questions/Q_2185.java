package Leetcode_questions;

public class Q_2185 {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        // without using startsWith function
        int count = 0;

        for (String word : words) {
            boolean isPreFix = true;
            if (word.length() < pref.length()) {
                continue;
            }
            for (int i = 0; i < pref.length(); i++) {
                if (word.charAt(i) != pref.charAt(i)) {
                    isPreFix = false;
                }
            }
            if (isPreFix) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println(prefixCount(words, pref));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}
