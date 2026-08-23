import java.util.Scanner;
public class removeSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text.replace(" ",""));
    }
}