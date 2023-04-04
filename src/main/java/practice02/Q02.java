package practice02;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        //Ask user to enter first name, middle name and last name as one single String, then print the first character of middle name and last name.
        //e.g. Mark Hansel Twain==> HT

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first, middle nd last name...");
        String str = input.nextLine().trim().toUpperCase();

        //char initialOfMiddle =str.charAt(5);
        //System.out.print(initialOfMiddle);

       // char initialOfLast =str.charAt(12);
       // System.out.print(initialOfLast);

        char initialOfMiddle =str.charAt(str.indexOf(" ")+1);
        char initialOfLast =str.charAt(str.lastIndexOf(" ")+1);
        System.out.print(" "+initialOfMiddle + initialOfLast);



    }
}
