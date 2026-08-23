import java.util.Scanner;
public class secondLarge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] num = new int [n];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int largest = 0;
        int second_largest = 0;
         for (int i = 0; i < num.length; i++){
            if (num[i] > largest){
                second_largest = largest;
                largest = num[i];
            }
        
            if (num[i] < largest && num[i] > second_largest){
                second_largest = num[i];
        }
    }
    System.out.println("The second largest number is:" + second_largest);
    }
}