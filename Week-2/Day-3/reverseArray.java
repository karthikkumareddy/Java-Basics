import java.util.Scanner;
public class reverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int [n];
        int [] sort = new int [n];
        int left = 0;
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
        for (int i = 0; i< num.length;i++){
            sort[i] = num[i];
            System.out.print(sort[i] + " ");
        }
        

    }
}