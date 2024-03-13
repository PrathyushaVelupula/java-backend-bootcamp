package javabrains.javacollections;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.*;

import static java.util.Collections.sort;

public class ListHomework1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(442);
        list.add(54);
        list.add(446);
        list.add(56);
        list.add(454);
        list.add(546);
        list.add(46);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the following Options : 1. Add an element to the list\n" +
                "2. Remove an element from the list\n" +
                "3. Find the minimum element in the list\n" +
                "4. Find the maximum element in the list\n" +
                "5. Print the contents of the list\n" +
                "6. Quit the program \n "+
                "Enter option :");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter an integer to add into the list ");
                int num = sc.nextInt();
                list.add(num);
                System.out.println("Integer added to the list");
                for(int l:list) {
                    System.out.println(l);
                }
                break;
            case 2 :
                System.out.println("Enter an integer to remove from the list ");
                int num2 = sc.nextInt();
                if(list.contains(num2)) {
                    boolean flag  = list.remove(Integer.valueOf(num2));
                    if(flag ) {
                        System.out.println("Integer removed from the list ");
                        for (int l : list) {
                            System.out.println(l);
                        }
                    }
                }
                else{
                    System.out.println("Element not found in list ");
                }
                break;

            case 3:
                Collections.sort(list);

                System.out.println("Minimum element in the list is "+list.get(0));
                break;

            case 4:
                Collections.sort(list,Collections.reverseOrder());
                System.out.println("Maximum element in the list is "+list.get(0));
                break;

            case 5:
                Iterator<Integer> itr = list.iterator();
                System.out.println("Elements in the list are ");
                while (itr.hasNext()){
                    System.out.println(itr.next());
                }

        }



}
}
