package Twenty_six_march;

public class Q_11 {
    public static void main(String[] args) {
        String s1 = "hello mme";
        int[] arr = new int[128];

        for (int i = 0; i < s1.length(); i++){
            int ascii = s1.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for (int i = 0; i < arr.length; i++){
            char c = (char) i;
            if (arr[i] > 1){
                System.out.println(c);
            }
        }

//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.substring(i + 1).contains(s1.charAt(i) + "")) {
//                System.out.println(s1.charAt(i));
//            }
//        }

    }
}
