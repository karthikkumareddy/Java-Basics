import java.util.Scanner;
/* 
class Day6{
    public static void greet(){
        System.out.println("welcome Karthik kumar reddy");
    }
    public static void main(String[] args){
        greet();
        greet();
    }
}
public class Day6 {
    public static int add(int n){
        return n * n;
    }
    public static void main(String[] args){
        int result = add(6);
        System.out.println(result);
    }
}
public class day6{
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        int result = add(10,20);
        System.out.println(result);
    }
}
public class Day6{
    public static boolean Even(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterthe number");
        int input = sc.nextInt();
        boolean result = Even(input);
        System.out.println(result);
    }
}*/
public class Day6{
    public static int largest(int a,int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input1 = sc.nextInt();
        int result = largest(input,input1);
        System.out.println(result); 
    }
}
   



