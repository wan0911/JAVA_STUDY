import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        char word = in.next().charAt(0);
        int cnt = 0;

        words = words.toUpperCase();
        word = Character.toUpperCase(word);

        //String[] arr = words.split("");
        //System.out.println(Arrays.toString(arr));


        for (int i=0; i < words.length(); i++) {
            if (words.charAt(i) == word) {
                cnt++;
            }
        }      

        // for (int i=0; i < arr.length; i++) {
        //     if (arr[i] == word) cnt++;
        // }
        System.out.println(cnt);
    }
}