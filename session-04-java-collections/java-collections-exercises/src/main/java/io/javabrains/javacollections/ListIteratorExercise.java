package javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        ListIterator<String> itr = list.listIterator();
        System.out.println("List elements in forward order ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("List elements in reverse order");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
