// 대문자 -> 소문자, 소문자 -> 대문자

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] arr = new String[str1.length()];

        for (int i=0; i < str1.length(); i++) {
            if (Character.isUpperCase(str1.charAt(i))) {
                arr[i] = str1.toLowerCase();
            } else {
                arr[i] = str1.toUpperCase();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}