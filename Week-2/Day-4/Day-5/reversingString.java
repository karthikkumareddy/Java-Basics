/*import java.util.Scanner;
public class reversingString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();
        int  left = 0;
        int right = text.length()-1;
        char [] arr = text.toCharArray();
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        String reverse = new String(arr);
        System.out.println(reverse);
    }
}
  */
 // Leet code Problem //
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        
    }
}