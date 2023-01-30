package Navin.alien.play;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Play2 {

    public static void main(String[] args) {

       List value = new ArrayList<>();
        value.add(56);
        value.add(1000);
        value.add(10);
        value.add(89);
        value.add(25);
        value.add(122);

        Collections.sort(value);

        value.forEach(System.out::println);
//        Iterator i= value.iterator();
//
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//            System.out.println(i.next());
//        }

//        for(Object i: value)
//        {
//            System.out.println(i);
//        }

    }
}
