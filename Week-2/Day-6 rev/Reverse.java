import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int left = 0;
    
        int [] num = new int [n];
        int right = num.length-1;
        for (int i = 0; i < num.length;i++){
            num[i] = sc.nextInt();
        }
        while (left < right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
        for (int i : num){
            System.out.print(i + " ");
        }
    }
}