import java.util.Scanner;
public class sorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int count = 0;
        int [] num = new int [n];
        for (int i = 0; i < num.length;i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length-1; i++){
            if (num[i] > num[i+1]){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}