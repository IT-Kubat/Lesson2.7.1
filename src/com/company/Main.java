package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> color = new ArrayList<>(3);
        color.add("Red");
        color.add("Green");
        color.add("Black");
        System.out.println("Оригинал списка:" + color);
        color.ensureCapacity(6);
        color.add("White");
        color.add("Pink");
        color.add("Yellow");

        Collections.sort(color);
        System.out.println("Spisok v alfavitnom poryadke" + color);
        Collections.reverse(color);
        System.out.println("Spisok v obratnom poryadke" + color);
        Iterator iterator = color.iterator();
        while (iterator.hasNext()){
            Object f = iterator.next();
            System.out.println(f);
        }





    }
}
