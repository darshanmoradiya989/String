package Assignment;

public class Convert_string_to_integer {
    public static void main(String[] args) {
        String a = "123b4557yu";
        int b = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) - '0' >= 0 && a.charAt(i) - '0' <= 9) {
                b = b * 10 + a.charAt(i) - '0';
            }
        }

        System.out.println(b);

    }
}
