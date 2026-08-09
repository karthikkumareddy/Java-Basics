import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}