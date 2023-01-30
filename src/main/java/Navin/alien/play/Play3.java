package Navin.alien.play;

import java.util.Vector;

public class Play3 {

    public static void main(String[] args) {

        Vector <Integer>v=new Vector<>();
        v.add(45);
        v.add(98);
        v.add(4);
        v.add(85);
        System.out.println(v.capacity());
        for(int i: v)
        {
            System.out.println(i);
        }

    }
}
