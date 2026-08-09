import java.util.Scanner;
public class FindMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int largest = -999;
        int [] arr = new int [n];
        for (int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest number is: " + largest);
    }
}