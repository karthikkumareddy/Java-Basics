import java.util.Scanner;
public  class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =  0;
        int [] num = new int [n];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Entr the target element");
        int target = sc.nextInt();
        for(int i = 0; i < num.length;i++){
            if (num[i] == target){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("number of times:" + count);
    }
}