package practice8;

public class MarketRunner {
    public static void main(String[] args) {
        Market obj1=new Market("Cheese", 10, 15);
        System.out.println("Product name: "+ obj1.productName+ "product price: $"+obj1.productPrice+" expiration date: "+obj1.expirationDate);

        Market obj2=new Market("Doll", 20.50);
        System.out.println("Product name: "+ obj2.productName+ " product price: $"+obj2.productPrice+ " expiration date: "+obj2.expirationDate);

        Market obj3=new Market("Milk",4.99, 3);
        System.out.println("Product name: "+ obj3.productName+ " product price: $"+obj3.productPrice+ " expiration date: "+obj3.expirationDate);

        Market obj4=new Market("Salt",3.5);
        System.out.println("Product name: "+ obj4.productName+ " product price: $"+obj4.productPrice+ " expiration date: "+obj4.expirationDate);
    }

}
