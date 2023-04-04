package practice8;

public class Q04 {

    //Create a method that joins the given Strings
    //input ==>"please, "join", "the", "given", "words"
    //output==>"please join the given words"
    public static void main(String[] args) {


        join("Please", "join", "the", "given", "words");
        join("!");


    }
    public static void join(String...str){
        String strNew="";
        for(String w:str){
            strNew+=w +" ";
        }
        System.out.println(strNew);
    }
}
