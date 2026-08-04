import java.util.Scanner;
/*public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int c =num1+num2;
        System.out.println("the sum is: " + c);



    }
}

public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double
         area = 3.15 * radius * radius;
        System.out.println(area);
        }
}

    public class Hello{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the priniple");
            int p = sc.nextInt();
            System.out.println("Enter the Rate");
            int r = sc.nextInt();
            System.out.println("Enter the Time");
            int t = sc.nextInt();
            int interest = p*t*r/100;
            System.out.println("Simple interest is:" + interest);

        }
    }
    public class Hello{
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
            
public class Hello{
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
}           p 
    
   public class Hello{
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

public class Hello{
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
    
public class Hello{
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
public class Hello{
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
public class Hello{
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
public class Hello{
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
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        while (i < n){
            System.out.println(i);
            i++;
        }
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        int sum =0;
        while (i < n){
            if (i % 2 == 0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }

    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);

    }
}*
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);

        if (rev == temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i <= n){
            count += 1;
            i++;
        }
        System.out.println(count);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int largest  = 0;
        while(n > 0){
            int digit  = n % 10;
            if (largest < digit){
                largest = digit;
            }
            n /= 10;
        }
        System.out.println("Largest Number: " + largest);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int largest  = 9;
        while(n > 0){
            int digit = n % 10;
            if (largest > digit){
                largest = digit;
            }
            n /= 10;
        }
        System.out.println(largest);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0){
            count = count + 1;
            n /= 10;
        }
        System.out.println(count);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int mul = 1;
        while(n > 0){
            int digit = n % 10;
            mul = mul * digit;
            n /= 10; 
        }
        System.out.println(mul);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 == 0){
                count = count + 1;
                 
            }
             n /= 10;
        }
        System.out.println(count); 
        }
    }
   public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 != 0){
                count = count + 1;
                 
            }
             n /= 10;
        }
        System.out.println(count); 
        }
    }
   public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 0;
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            if (digit % 2 == 0){
                k = k * 10 + digit;
               

            }
            num /=10;
        }
         System.out.print(k + " ");
        while (k > 0){
            int number = k % 10;
            rev = rev * 10 +number;
            k /= 10;
        }
        System.out.print(rev + "  ");
       
    }
   }public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int k = n;
        int l = n;
        int count = 0;
        int sum = 0;
        while (n > 0){
            count = count + 1;
            n /= 10;
        }
        while (k > 0){
         int temp1 = k % 10;
         sum += (int) Math.pow(temp1,count); 
         k /= 10;  
        }
        if (l == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i =2;
        int count = 0;
        if(n == 1){
            System.out.println("Not Prime number");
        }
        while(n > i){
            if(n % i == 0){
                count++;
                break;
            }
            i++;
        }
        if (count == 1){       
            System.out.println("Not prime number");
        }
        else{
            System.out.println("Prime number");
        }

    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 1; i <= 10;i++){
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp1 = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++){
                fact = fact * i;   
            }
         
            sum = sum + fact;
            n /= 10;
        }
        if(sum == temp1){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
}*
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int largest = 9;
        while(n > 0){
            int digit = n % 10;
            if (largest > digit){
                largest = digit;
            }
            n /= 10;
        }
        System.out.println(largest);
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++){
            if(n % i==0){
                sum = sum+i;
            }
        }
        if(n == sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
        
    }
}
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        int i = 2;
        while (n > i){
            if (n % i == 0){
                count++;
                break;
            }
            i++;
        }
        if (count == 0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}*/
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= n; i++){
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}


