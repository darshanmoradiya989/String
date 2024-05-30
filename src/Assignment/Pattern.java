package Assignment;

public class Pattern {
    public static void main(String[] args) {
        String p = "PROGRAM";

        for (int i = 0; i <= p.length(); i++) {
            System.out.println(p.substring(0, i));
        }
    }
}
