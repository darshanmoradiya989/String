package Twenty_six_march;

public class Q_12 {
    public static void main(String[] args) {
        // remove all digits
        String name = "dars123han123";

        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) - '0' >= 0 && name.charAt(i) - '0' <= 9)) {
                System.out.print(name.charAt(i));
            }
        }
    }
}
