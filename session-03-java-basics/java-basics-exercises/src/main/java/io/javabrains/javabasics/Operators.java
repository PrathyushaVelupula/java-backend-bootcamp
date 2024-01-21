package main.java.io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        //ArrayList
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        int a = integerList.get(0);
        int b = integerList.get(1);
        // Step 2: Perform arithmetic operations
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        // Step 3: Print the results of the arithmetic operations
        System.out.println("Addition of "+a+" and "+b+" is "+add+"\n");
        System.out.println("Subtraction of "+a+" and "+b+" is "+sub+"\n");
        System.out.println("Multiplication of "+a+" and "+b+" is "+mul+"\n");
        System.out.println("Division of "+a+" and "+b+" is "+div+"\n");
        System.out.println("Modular division of "+a+" and "+b+" is "+mod+"\n");

        // Step 4: Perform increment and decrement operations
        a++;
        b--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("Increment of a is "+a+"\n");
        System.out.println("Decrement of b is "+b+"\n");
        // Step 6: Perform comparison operations
        boolean val1 = a==b;
        boolean val2 = a>b;
        boolean val3 = a<b;
        boolean val4 = a>=b;
        boolean val5 = a<=b;
        boolean val6 = a!=b;

        // Step 7: Print the results of the comparison operations
        System.out.println("Value of a = b is "+val1+"\n");
        System.out.println("Value of a > b is "+val2+"\n");
        System.out.println("Value of a < b is "+val3+"\n");
        System.out.println("Value of a >= b is "+val4+"\n");
        System.out.println("Value of a <= b is "+val5+"\n");
        System.out.println("Value of a != b is "+val6+"\n");

        // Step 8: Perform logical operations
        boolean cond1 = true;
        boolean cond2 = false;
        boolean resultAnd = cond1 && cond2;
        boolean resultOr = cond1||cond2;
        boolean resultNot = !cond1;
        // Step 9: Print the results of the logical operations
        System.out.println("Logical and :"+resultAnd);
        System.out.println("Logical OR :"+resultOr);
        System.out.println("Logical Not :"+resultNot);

    }
}
