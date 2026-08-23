import java.util.Scanner;
public class reversing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text =  sc.nextLine();
        String rev = "";
        for (int i = text.length()-1; i >= 0; i--){
            rev =rev + text.charAt(i) ;
        }
        System.out.println(rev);
    }
}