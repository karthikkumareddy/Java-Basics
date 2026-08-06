
import java.util.Scanner;
/* 
    public class Day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        int reverse = 0;
        while(num1 != 0){
            int digit = num1 % 10;
            reverse = reverse * 10 + digit;
            num1 = num1 / 10;
        }
        System.out.println("reverse number is:"+ reverse);

    }
}
    
public class Day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        char ch = sc.next().charAt(0);
        if (ch > 'A' && ch < 'B'){
            System.out.println("the character is upper case:" +ch);
        }
        else{
        System.out.println("No");        }

    }
}
public class Day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num / 10;
        switch (num1){
            case 9:
                System.out.println("Grade is: A");
                break;
            case 8:
                System.out.println("Grade is: B");
                break;
            case 7:
                System.out.println("Grade is: c");
                break;        
        }
    }
}
public class Day4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount");
        int balance = sc.nextInt();
         System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Current balance:" + balance);
            case 2:
                System.out.println("Enter te deposite amount");
                int deposite = sc.nextInt();
                balance = balance + deposite;
                System.out.println("Deposite  successfully");
                System.out.println("New Balance:" + balance);
            case 3:
                System.out.println("Enter the withdraw amount");
                int withdraw = sc.nextInt();
                System.out.println("with daw amount:" + withdraw); 
                if (withdraw < balance){
                balance = balance - withdraw;
                System.out.println("Remainning Balnce:" + balance);
            }
            else{
                System.out.println("Insufficient Amount");
            }       
        } 
    }
}
    */
public class Day4{
    public static void main(String[] args){
        System.out.println("------Welcome to Karthik kumar reddy restaurent------");
        System.out.println(" 1.South Indian");
        System.out.println("2.North Indian");
        System.out.println("3.Chinese");
        System.out.println("4.Deserts");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ctegory");
        int category = sc.nextInt();
        String item = "";
        int price = 0;
        int choice;
        switch(category){
            case 1:
                System.out.println("-----South Indian Menu------");
                System.out.println("1. Idly");
                System.out.println("2. Dosa");
                System.out.println("3. Poori");
                System.out.print("Select an item: ");
                choice = sc.nextInt();

                switch(choice){
                    case 1:
                        item = "Idly" ;
                        price = 50;
                        break;
                    case 2:
                        item = "Dosa";
                        price = 80;
                        break;
                    case 3:
                        item = "poori";
                        price = 60;
                        break;        
                }

                break;
            case 2:
                System.out.println("------North Indian Menu------");
                System.out.println("1. Butter Naan");
                System.out.println("2. Paneer Curry");
                System.out.println("3. Jeera Rice");
                System.out.print("Select an item: ");
                choice = sc.nextInt();
                switch(choice){
                    case 1: item = "Butter Naan"; price = 40; break;
                    case 2: item = "Paneer Curry"; price = 150; break;
                    case 3: item = "Jeera Rice"; price = 120; break;
                    default: 
                    System.out.println("Invalid Item!"); return;
                }

                break;
           }
            System.out.println("Enter quantity");
            int quantity = sc.nextInt();
            int total = quantity * price;
            System.out.println("Total bill:"+total);


    }
}
