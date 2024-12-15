import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String[] arr = str1.split(" "); 
    String result = arr[0];

    for(int i=0; i < arr.length; i++) {
      if (arr[i].length() > result.length()) {
        result = arr[i];
      }
    }
    System.out.println(result);
  }
}