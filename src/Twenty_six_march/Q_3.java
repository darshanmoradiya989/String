package Twenty_six_march;

public class Q_3 {
    public static void main(String[] args) {
        //check if a String is Palindrome?
        String s1 = "nitin";

        int start = 0, end = s1.length() - 1;

        while (start < end) {
            if (s1.charAt(start) != s1.charAt(end)) {
                System.out.println("not palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("palindrome");
    }
}
