package practice05;

public class Budget {

    //Type code to calculate house and house members' own budgets.
    static int decreaseHouseBudget =10000;
    int ownBudget=2000;

    static void houseBudget(int outcome){

        decreaseHouseBudget -=outcome;
    }

    void decreaseOwnBudget(int outcome){

        ownBudget-=outcome;
    }

    public static void getSalary(int salary){
        decreaseHouseBudget +=salary;

    }
}
