package practice04;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=scan.nextInt();

        int a=0;

        for(int i =0; i<row; i++){//row control

            for(int j= 0; j<=i; j++){ //column control
                System.out.print(++a+" ");

            }
            System.out.println();
        }
    }

}
