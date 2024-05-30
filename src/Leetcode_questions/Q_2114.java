package Leetcode_questions;

public class Q_2114 {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxMain = 0;

        for (int i = 0; i < sentences.length; i++) {
            int max = Integer.MIN_VALUE;
            String[] str = sentences[i].split(" ");
            max = str.length;
            if (max > maxMain) {
                maxMain = max;
            }
        }

        return maxMain;
    }


}
