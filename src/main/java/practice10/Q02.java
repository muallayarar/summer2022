package practice10;

import java.util.Scanner;

public class Q02 {

      /*
    Ask user to enter a number and print on console number by number matrix.

    Example:
    Input: 10

    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0

*/
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter a number");
          int number= scan.nextInt();

          for (int i = 0; i < number; i++) {
              for (int j = 0; j< number; j++) {
                  System.out.print((int)(Math.random()*2)+" ");

              }
              System.out.println();
          }
      }


}
