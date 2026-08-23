import java.util.Scanner;
public class linear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        
        int [] num = new int [n];
        int count = 0;
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        for (int i = 0; i < num.length; i++){
            if (num[i] == target){
                System.out.println(  "Yes found");
                System.out.println("it is found at:" + i);
                count++;
                
            }   
           
          } 
          System.out.println("Number of repeat:" + count); 

        
    }
}