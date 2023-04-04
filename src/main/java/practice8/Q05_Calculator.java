package practice8;

public class Q05_Calculator {

    /*
        Create a basic calculator, create add,subtract,multiply,divide methods.
     */

    public void add(double...a){
        int sum=0;
        for (double w:a){
            sum+=w;
        }
        System.out.println("The sum is "+sum);
    }
    public void subtraction(double a, double b){
        System.out.println("the difference is: " + (a-b));
    }
    public void multiplication(double...a){
        double product=1;//product means result of multiplication
        for(double w:a ){
            product*=w;
        }
        System.out.println("The product is: "+ product);
    }
    public void division(double a, double b){
        if(b==0){
            System.out.println("Do not use 0 for the second parameters ");
        }else{
            System.out.println("result of division(quotient): "+(a/b));
        }
    }
}
