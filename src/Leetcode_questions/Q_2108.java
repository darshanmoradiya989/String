package Leetcode_questions;

public class Q_2108 {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])){
                return words[i];
            }
        }

        return "";
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
