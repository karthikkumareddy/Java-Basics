import java.util.Scanner;
public class sortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int [n];
        int count = 0;
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
for (int i = 0; i < num.length - 1; i++) { 
    if (num[i] > num[i + 1]) {
       count++;
       break;
    }
}

if (count == 0) { 
   System.out.println("Sorted");
} else {
   System.out.println("Not sorted"); 
}

    }
}

