package Twenty_six_march;

import java.util.Arrays;

public class Practice_methods {
    public static void main(String[] args) {
        String name  = "harsh"; // using string literal it is stored in string pool
        String s1 = new String("harsh"); // using new keyword stored in heap

        System.out.println(name == s1); //false because it check address

        System.out.println(name.equals(s1)); // true because it check character and deep comparison

        String s2 = "hello";
        s2 = s2.toUpperCase();
        System.out.println(s2);

        s2 = s2.substring(1,2);
        System.out.println(s2);

        s2 = s2.concat(s1);
        System.out.println(s2);

        String s3 = " hello i am ";
        s3 = s3.trim();
        System.out.println(s3);

        s3 = s3.replace("l","y");
        System.out.println(s3);

        s3 = s3.replaceFirst("l","y");
        System.out.println(s3);

       String s4 = new String("how are you").intern(); // adding hello to string pool using intern()

        s4 = s4.substring(0,3);
        System.out.println(s4);
    }
}
