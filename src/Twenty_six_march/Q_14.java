package Twenty_six_march;

public class Q_14 {
    public static void main(String[] args) {
        // check if all words are palindrome
        String s1 = "madam nitin";

        int left = 0;
        for (int i = 0; i < s1.length(); i++) {
            int current = left;
            int right = 0;
            if (s1.charAt(i) == ' ') {
                right = i - 1;
                left = i + 1;
            } else if (i == s1.length() - 1) {
                right = s1.length() - 1;
            }
            if (!isPalindrome(s1, current, right)) {
                System.out.println("not palindrome");
                return;
            }
        }

        System.out.println("palindrome");


//        String[] words = s1.split(" ");
//
//        for (int i = 0; i < words.length; i++) {
//         char[]  chars = words[i].toCharArray();
//            int left = 0;
//            int right = chars.length - 1;
//            while (left <= right) {
//                if (chars[left] != chars[right]) {
//                    System.out.println("not palindrome");
//                    return;
//                }
//                left++;
//                right--;
//            }
//        }
//
//        System.out.println("palindrome");

    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
