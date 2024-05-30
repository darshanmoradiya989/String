package Twenty_six_march;

public class Q_16 {
    public static void main(String[] args) {
        String name = "abbcdghd";
        StringBuilder newName = new StringBuilder();
        int[] arr = new int[128];

        for (int i = 0; i < name.length(); i++){
            int ascii = name.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for (int i = 0; i < arr.length; i++){
            char c = (char) i;
            if (arr[i] == 1){
                newName.append(c);
            }
        }

        System.out.println(newName);



//        for (int i = 0; i < name.length(); i++) {
//            if (!(name.substring(i + 1).contains(name.charAt(i) + ""))) {
//               newName.append(name.charAt(i));
//            }
//        }
//
//
//        char[] chars = name.toCharArray();
//        int n = chars.length;
//
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                if (chars[i] == chars[j]){
//                    for (int k = j; k < n - 1; k++){
//                        chars[k] = chars[k + 1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
//
//        name = new String(chars, 0, n);
//        System.out.println(name);
//
//        System.out.println(newName);
    }
}
