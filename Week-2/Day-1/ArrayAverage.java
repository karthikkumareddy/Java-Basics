public class ArrayAverage{
    public static void main(String[] args){
        int [] num = {10,20,30,40,50};
        int size = num.length;
        int total = 0;
        double avg  = 0;
        for (int i = 0; i < num.length; i++){
            total = total + num[i];
        }
        avg = total / size;
        System.out.println("%.2f");
        System.out.println("Average is: " + avg);
    }
}