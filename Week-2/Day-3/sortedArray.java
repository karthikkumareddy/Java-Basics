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
        // Ee logic ippudu perfect ga panichesthundhi
for (int i = 0; i < num.length - 1; i++) { 
    if (num[i] > num[i + 1]) {
       count++;
       break;
    }
}

if (count == 0) { // Zero (0) use chesanu
   System.out.println("Sorted");
} else {
   System.out.println("Not sorted"); // Double quote pettanu
}

    }
}

