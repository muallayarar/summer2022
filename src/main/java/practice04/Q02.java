package practice04;

public class Q02 {

    public static void main(String[] args) {

        /*
        Write a java program to take the last three characters from a given string and
        add these three characters at both the front and back of the string
         */

        String str="john Doe";
        //str.substring(5);
        //System.out.println(str.substring(5));
        String lastThreeChars=str.substring(str.length()-3);
        System.out.println(lastThreeChars);
        System.out.println(lastThreeChars+str+lastThreeChars);

    }
}
