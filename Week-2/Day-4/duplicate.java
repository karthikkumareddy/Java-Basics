import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num [] = new int[n];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++){
            for (int j = i+1; j < num.length; j++){
                if (num[i] == num[j]){
                    System.out.println(num[i]);
                }
            }
        }
        
    }
}