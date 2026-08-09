import java.util.Scanner;
public class RunningSum{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the araay size");
        int num = sc.nextInt();
        int initial = 0;
        int [] arr = new int [num];  
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            initial = initial + arr[i];
            arr[i] = initial;
            System.out.print(arr[i]  + " ");
            
        }
    }
    }
