package practice8;

public class Q01 {
    /*
    Create a method that adds given Integers except the first one and
    multiplies the sum by the first Integer
     */
    public static void main(String[] args) {
        myMethod(2,5,6);
        myMethod(0,3,5,7,9);
        myMethod(1,1,2,3);
        myMethod(5);
        myMethod(3,4);
    }

    public static void myMethod(int a, int ... numbers ){
        int sum=0;
        for (int w: numbers){
            sum+=w;
        }
    int result= a*sum;
        System.out.println(result);
    }
}
