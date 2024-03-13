package javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
            int intNum = 34;
        // long variable to store a long value
            long longNum = 686922L;
        // float variable to store a floating-point value
            float floatNum = 45.5f;
        // double variable to store a double value
            double doubleNum = 3679d;
        // char variable to store a single character
            char charVar = 'A';
        // boolean variable to store a boolean value
            boolean boolVal = true;
        // String variable to store a string of characters
            String str = "String";
        // Step 2: Print the values of the variables to the console
            System.out.println("Initial values are \n"+intNum+"\n"+longNum+"\n"+floatNum+"\n"+doubleNum+"\n"+charVar+"\n"+boolVal+"\n"+str+"\n");

        // Step 3: Modify the values of the variables and print the updated values
        intNum = 45;
        longNum = 66786922L;
        floatNum = 95.5f;
        doubleNum = 53349d;
        charVar = 'B';
        boolVal = false;
        str = "one more";
        System.out.println("Modified values are \n"+intNum+"\n"+longNum+"\n"+floatNum+"\n"+doubleNum+"\n"+charVar+"\n"+boolVal+"\n"+str+"\n");

    }
}
