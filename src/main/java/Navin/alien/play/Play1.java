package Navin.alien.play;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Play1 {
    public static void main(String[] args) {

        Collection value = new ArrayList<>();
        value.add(56);
        value.add("aditya");
//
//        Iterator i= value.iterator();
//
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//            System.out.println(i.next());
//        }

        for(Object i: value)
        {
            System.out.println(i);
        }

    }
}
