package Twenty_six_march;

public class Q_5 {
    public static void main(String[] args) {
        // Update a character in a string (without using .replace() function)
        String s1 = "hello";
        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o'){
                chars[i] = 'l';
            }
        }

        s1 = new String(chars);
        System.out.println(s1);

    }

}
