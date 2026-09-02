class Movieticket{
    private String movieName;
    private int seatNumber;
    private double ticketPrice;

    Movieticket(String movieName,int seatNumber,double ticketPrice){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }
    public String getMovieName(){
        return this.movieName;
    }
    public int getseatNumber(){
        return this.seatNumber;
    }
    public double getticketPrice(){
        return this.ticketPrice;
    }

    public void ticketprice( double price){
        if (price >= 150){
            this.ticketPrice = price;
        }
        else{
            System.out.println("Ammount can not be less than 150");
        }
    }
}
public class Main{     public static void main(String[] args){
        Movieticket account1 = new Movieticket("Salaar",27,200);
        System.out.println(account1.getMovieName());
        System.out.println(account1.getseatNumber());
        System.out.println(account1.getticketPrice());

        account1.ticketprice(160);
        System.out.println("the new value is: " + account1.getticketPrice());

        account1.ticketprice(100);
        System.out.println("value after wrong input: " + account1.getticketPrice()); 
        
    }
}