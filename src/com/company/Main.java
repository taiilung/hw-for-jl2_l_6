package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        colors.ensureCapacity(6);

        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        Collections.sort(colors);

        Iterator iter = colors.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());

        }

        System.out.println("-----------------------------------------");

        Collections.reverse(colors);
        iter = colors.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("-----------------------------------------");

        Collections.shuffle(colors);

        iter = colors.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
