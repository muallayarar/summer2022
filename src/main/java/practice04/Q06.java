package practice04;

public class Q06 {

    public static void main(String[] args) {
        //Type code to print the elements of an array those are greater than average
        //int[] arr={5,9,15,1,0,11,3};
        int[] arr={5,9,15,1,0,11,3};
        int sum=0;
        for(int w:arr){
            sum+=w;
        }
        int average=sum/arr.length;
        System.out.println("average"+average);
        System.out.println("The numbers greater than average");
        for(int w: arr){
            if(w>average){
                System.out.print(w+" ");
            }
        }
    }
}
