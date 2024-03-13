package javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
    public static void main(String[] args) {
        FruitSupplier fs = new FruitSupplier();
        /* List<String> list = fs.getFruits().parallelStream().toList();
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            }*/
        Collection<String> fruits = fs.getFruits();
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}