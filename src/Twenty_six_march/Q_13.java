package Twenty_six_march;

public class Q_13 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "vehlo";
        StringBuilder s3 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            s3.append(s1.charAt(i));
            s3.append(s2.charAt(i));
        }

        System.out.println(s3);
    }
}
