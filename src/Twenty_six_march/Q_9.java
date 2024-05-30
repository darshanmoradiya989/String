package Twenty_six_march;

public class Q_9 {
    public static void main(String[] args) {
        String name = "hello";
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'||name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O'||name.charAt(i) == 'U')){
                newString.append(name.charAt(i));
            }
        }
        System.out.println(newString);

    }
}
