package practice02;

import java.util.Scanner;

public class Q06 {
    /*
        Type code to do bank transactions below at an ATM:
        Process 1: Balance inquiry
        Process 2: Money withdrawal
        Process 3: Deposit money
        Process 4: End the process

     */
    public static void main(String[] args) {
        System.out.println("welcome to TechPro bank");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of process: " + "\n" + "\n" + "Process 1: Balance inquiry" + "\n" + "Process2: Money withdrawal" + "\n" + " Process 3: Deposit money" + "\n" + " Process 4: End the process");// \n means next line
        int process = input.nextInt();
        int balance = 100;

        switch (process) {
            case 1:
                System.out.println("Your balance: " + balance);
                break;
            case 2:
                System.out.println("Enter the money you want to withdraw");
                int withdraw = input.nextInt();
                if (withdraw <= balance) {
                    balance = withdraw;
                    System.out.println("Your current balance after the withdrawal of $: " + withdraw + " : " + balance);
                } else {
                    System.out.println("Your balance is not enough");
                }
                break;
            case 3:

                System.out.println("Enter the amount of money you wnt to deposit.");
                int deposit = input.nextInt();

                if(deposit>2000){
                    System.out.println("Daily limit of deposit money at the ATM: $2000");
                }else {
                    balance += deposit;

                    System.out.println("Your current balance after the deposit of $" + deposit + ": " + balance);
                }
                break;
            case 4:
                System.out.println("Thanks for using TechPro Bank."+ "\n"+ "Good bye");
                break;
           }


    }
}