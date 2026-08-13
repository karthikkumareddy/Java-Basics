import java.util.Scanner;
public class vowelCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the Text:");
        String k = sc.nextLine();
        String small= k.toLowerCase();
        for (int i = 0; i < small.length(); i++){
            char ch = small.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The number of ovels:" + count);
    }
}