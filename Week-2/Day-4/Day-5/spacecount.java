import java.util.Scanner;
public class spacecount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}