import java.util.Scanner;
public class String_Extraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String text = sc.nextLine();
        //System.out.println(text.substring(3,7));//
        for(text.length() > 0){
            String lastchar = text.substring(text.length() - 1);
            System.out.println(lastchar);
        }
        
    }
}