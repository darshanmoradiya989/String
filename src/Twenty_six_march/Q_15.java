package Twenty_six_march;

public class Q_15 {
    public static void main(String[] args) {
        String name = "abc1234";
        int charCount = 0;
        int digitCount = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) - '0' >= 0 && name.charAt(i) - '0' <= 9) {
                digitCount++;
            } else {
                charCount++;
            }
        }

        if (charCount == digitCount) {
            System.out.println("digit and chars are equal");
        } else {
            System.out.println("digit and chars are not equal");
        }

    }
}

