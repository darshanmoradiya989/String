package Leetcode_questions;

public class Q_1662 {
    public static void main(String[] args) {
        String[] words1 = {"ab", "c"};
        String[] words2 = {"a", "bc"};
        String str1 = "";
        String str2 = "";

        for (String i : words1){
            str1 += i;
        }

        for (String i : words2){
            str2 += i;
        }

        if (str1.equals(str2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
