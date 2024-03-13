package javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListSwap {
    public static <T>void swapList(List<T> list, int n1, int n2){
        if(list==null || n1<0 || n2<0 || n1==n2 || n1> list.size() || n2> list.size()){
            System.out.println("Swapping is not supported");
        }
        else{
            T temp = list.get(n1);
            temp = list.set(n1, list.get(n2));
            list.set(n2,temp);
            System.out.println("Elements after swapping : ");
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in the list : ");
        int n = sc.nextInt();
        List<Object> list = new ArrayList<>();
        System.out.println("enter elements into the string");
        for(int i = 0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.println("Enter two index values from 0 to "+(n-1)+" to swap");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        swapList(list,n1,n2);

    }
}
