package javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(24);
        list.add(223);
        list.add(21);
        list.add(4322);
        list.add(5624);
        int add =0;
        for(int l:list){
            add+= l;
        }
        System.out.println(add);
    }

}
