public class ArrayLargest{
    public static void main (String[] args){
        int [] num = {1,2,3,4,5,6};
        int largest = 0;
        for (int i = 0; i < num.length; i++){
            if (largest < num[i]){
                 largest = num[i];
            }
           
        }
         System.out.println("Largest Element is: " + largest);
        }
    }
