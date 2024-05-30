package Twenty_six_march;

public class Q_6 {
    public static void main(String[] args) {
        // Program to check if two strings are same or not (without using inbuilt function .equals())
        String s1 = "hello";
        String s2 = "hello";

        boolean isSame = true;

        if (s1.length() != s2.length()){
            isSame = false;
            System.out.println(isSame);
            return;
        }

        for (int i = 0; i < s1.length(); i++){
             if (s1.charAt(i) != s2.charAt(i)){
                 isSame = false;
                 break;
             }
        }

        System.out.println(isSame);

    }
}
