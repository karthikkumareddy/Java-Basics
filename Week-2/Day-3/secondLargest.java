import java.util.Scanner;
public class secondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the array size:");
        int n = sc .nextInt();
        int [] arr = new int [n];
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largest =-999;
        int second_largest = -999;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }

            else if (arr[i] > second_largest && arr[i] < largest){
                arr[i] = second_largest;
            }
        }
        System.out.println("Second largest:" + second_largest);

    }
}