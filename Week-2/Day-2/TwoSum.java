import java.util.Scanner;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size");
        int arr = sc.nextInt(); 
        int [] num =new int [arr];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();
       
        for (int i = 0; i < num.length; i++){
            for (int j = 1+i; j < num.length; j++){
                if (num[i] + num[j] == target){
                    System.out.println("[" + i + ", " + j + "]");
                    break;
                    
                }
            }
        
        }

    }
}