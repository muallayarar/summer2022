package practice7;
//Check if a string is palindrome or not.
public class Q01 {
    //123321
    public static void main(String[] args) {
       /* StringBuilder sb1=new StringBuilder("123321");
        String str=sb1.toString();
        String reversed=sb1.reverse().toString();
        System.out.println("Is String palindrome? "+ str.equals(reversed));*/

    String str="civic";
    String reversedSTR= new StringBuilder(str).reverse().toString();
    System.out.println("Is String palindrome "+str.equals(reversedSTR));

    }

}
