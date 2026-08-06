import java.util.Scanner;
/* 
public class Day3{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number value of a");
            int a = sc.nextInt();
            System.out.println("Enter the number value of b");
            int b = sc.nextInt();
            a = a + b;
            b = a - b;
            a = a- b;
            System.out.println("a value is" + a);
            System.out.println("b value is :" +b);
            }
               
}

   public class Day3{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number value of a");
            int a = sc.nextInt();
            System.out.println("Enter the number value of b");
            int b = sc.nextInt();
            a = a + b;
            b = a - b;
            a = a- b;
            System.out.println("a value is" + a);
            System.out.println("b value is :" +b);
            }
             }   
            
public class Day3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if ((b > a && a > c) || (c > a && a > b)){
            System.out.println(a);
        }
        else if ((a < b && b < c) || (a > b && b > c)){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}  
*/

   public class Day3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println(c);
        if (a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < a){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        
    }
}