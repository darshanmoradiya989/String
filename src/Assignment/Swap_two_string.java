package Assignment;

public class Swap_two_string {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
