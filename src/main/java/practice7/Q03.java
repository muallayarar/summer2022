package practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
/*
    Type a simple 5-item grocery shopping program.
       1st Step: Select a product from the product list and ask how much it weights.
       2nd Step: Ask if he/she wants to buy another item.
                      If she/he does not want it, show the total amount, if she/he does, select the product again.
       3rd Step: Each time the customer selects an item, add the price of the item they bought to the total price.
       4th Step: Show the total amount to be paid when the shopping is over.
    */

    static List<String> productList=new ArrayList<>();
    static List<Double> priceList=new ArrayList<>();
    static double totalAmount;

    public static void main(String[] args) {



        productList.add("Tomato-Product Code: 1");
        productList.add("Apple- Product Code: 2");
        productList.add("Melon-Product Code: 3");
        productList.add("Strawberry-Product Code: 4");
        productList.add("Potato-Product Code: 5");

        priceList.add(1.09);
        priceList.add(0.7);
        priceList.add(2.5);
        priceList.add(3.05);
        priceList.add(1.5);

        buyProduct();

    }
    public static void buyProduct(){

        Scanner scan=new Scanner(System.in);
        System.out.println(productList);
        System.out.println("Enter the product code you want to buy");
        int codeOfProduct=scan.nextInt();
        System.out.println("Enter how many kilograms you want to buy");
        double kilograms=scan.nextDouble();

        double productPrice =priceList.get(codeOfProduct-1);
        double totalProductPrice= productPrice*kilograms;
        totalAmount+=totalProductPrice;

        System.out.println("The product you chose "+ productList.get(codeOfProduct-1));
        System.out.println("The product price: "+totalProductPrice);
        System.out.println("To continue to shop enter 1, to go to grocery checkout enter 2");

        int decision=scan.nextInt();
        if(decision==1){
            buyProduct();
        }else{
            System.out.println("Grocery check-out");
        }

    }

    public static void groceryCheckout(){
        System.out.println("Total Amount: "+totalAmount);
        System.out.printf("%.2f",totalAmount);//%.2f==>3,245756857==>3,24
    }

}
