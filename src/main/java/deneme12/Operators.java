package deneme12;

public class Operators {

    public static void main(String[] args) {

        int result = 20 - 2*(5 + 3*2) - 1 ;
        System.out.println(result);

        //ıncrement
        int a = 12;
        //a = a+3;
        a+=3;
        System.out.println(a);

        //decrement
        int b = 15;
        b-=4;
        System.out.println(b);

        int d =30;
        d/=5;
        System.out.println(d);

        int e = 7;
        e= e*3;
        System.out.println(e);

        //ıncrement and decrement by 1
        int f = 17;
        f = f+1;
        f+=1;
        f++;
        System.out.println(e);

        int g = 13;
        g =g-1;
        g-=1;
        g--;
        System.out.println(g);

        //Comparison Operations
        int x =12;
        int y = 13;
        System.out.println(x<y);
        System.out.println(x==y);
        System.out.println(x>y);
        System.out.println(x!=y);

        //logical operators
        System.out.println(3<4 && 5>6);
        System.out.println(3>4 || 5>6);

        //post-increment
        int k = 12;

        int l = x++;
        System.out.println(l); //12
        System.out.println(k); //13

        //pre-increment
        int m=15;
        int n = ++m;
        System.out.println(n); //16
        System.out.println(m); //16


    }
}
