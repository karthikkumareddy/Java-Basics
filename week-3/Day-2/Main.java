class Car{
    String brand;
    int price;

    Car(String b, int p){
        brand = b;
        price = p;
    }
     void display(){
        System.out.println("car brand: " + brand);
        System.out.println("car price: " + price);
     }
}
 public class Main{
    public static void main(String[] args){
        Car sc = new Car("TATS",100000);

        sc.display();
    }
 }