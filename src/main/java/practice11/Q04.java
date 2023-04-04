package practice11;

import java.util.HashMap;
import java.util.Map;

public class Q04 {
    /*
        Print two arrays which contains firstname and lastname as the
        format : firstname=lastname
            input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output : {John=Doe, Mark=Twain, Ali=Can};
         */

    public static void main(String[] args) {
        String firstName[]={"John", "Mark", "Ali"};
        String lastName[]={"Doe", "Twain", "Can"};

        Map<String, String> fullName =new HashMap<>();
        for (int i = 0; i <firstName.length ; i++) {
             fullName.put(firstName[i], lastName[i]);
        }
        System.out.println(fullName);
    }
}
