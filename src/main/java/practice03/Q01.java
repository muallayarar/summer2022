package practice03;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        //Print numbers from given number till the next multiple of 10. e.g.,

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an ınteger");
        int num=input.nextInt();

        while (num%10!=0){
            System.out.print(num+" ");
           num++;

        }

    }
}
