class product{
    private String productName;
    private int stockCount;

    product(String productName,int stockCount){
        this.productName = productName;
        this.stockCount = stockCount;
    }

    public String getProductName(){
        return this.productName;
    }
    public int getStock(){
        return this.stockCount;
    }

    public void setStock(int count){
        if (count >= 0){
            this.stockCount = count;
        }
        else{
            System.out.println("stock can not be in negative");
        }
    }

}
public class commerce{
    public static void main(String[] args){
        product stock = new product("Laptop",10);
        System.out.println("the old stock is: " + stock.getStock());
        stock.setStock(-5);
        System.out.println("the new stock is: " + stock.getStock());
           stock.setStock(20);
        System.out.println("the new stock is: " + stock.getStock());
}
}