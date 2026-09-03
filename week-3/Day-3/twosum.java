//import java.util.Scanner;
// public int[] twosum(int [] nums,int target){
    /*HashMap<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++){
        int required = target - nums[i];

        if (map.containsKey(required)){
            return new int[]{map.get(required),i};
        }

        map.put(nums[i],i);
    }
    return new int[]{};
}*/
import java.util.*;
 public class twosum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int [] num = new int [n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt(); 
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        for (int i = 0; i < num.length; i++){
            int required = target - num[i];
            if (map.containsKey(required)){
                 System.out.println("[" + map.get(required) + "," + i + "]");
            }
            else{
                map.put(num[i],i);
            }
        }
        
    }
 }