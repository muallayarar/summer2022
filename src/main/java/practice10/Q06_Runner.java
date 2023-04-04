package practice10;

public class Q06_Runner {
    public static void main(String[] args) {

        Q06_Child obj=new Q06_Child();
        System.out.println(obj.rectangle(5,8));
        System.out.println(obj.triangle(4,7));

        obj.add(6,4);
    }
}
