package practice05;

public class budgetRunner {
    public static void main(String[] args) {



        Budget.houseBudget(2000);

        Budget son=new Budget();
        son.decreaseOwnBudget(150);
        Budget daughter=new Budget();
        daughter.decreaseOwnBudget(400);

        Budget.houseBudget(4000);

        son.houseBudget(2000);

        Budget.getSalary(20000);
        Budget.getSalary(10000);
        daughter.getSalary(5000);
        son.getSalary(1000);

        System.out.println("House budget: "+ Budget.decreaseHouseBudget);
        System.out.println("son budget: "+son.ownBudget);//1850
        System.out.println("daughter budget: "+ daughter.ownBudget);
    }
}
