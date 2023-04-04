package practice9;

public class Q05 {
    /*
	Create a method to calculate
	4 students first one has 6, second has 4,third has 3 and
	fourth has 5 exams' average respectively.
    */

    public static void main(String[] args) {

        calculateAverage("Ali",55,60,40,60,90,100);
        calculateAverage("Veli", 40,70,80,85);
        calculateAverage("Ayshe", 45,89,98);
        calculateAverage("Mualla", 75,80,90,95,100);
    }



    public static void calculateAverage(String stdName,double...mark){
        double sum=0;
        for (double w:mark){
            sum+=w;
        }
        System.out.println(stdName+ "'s average of exams: " +String.format("%.2f", sum/ mark.length));
    }
}
