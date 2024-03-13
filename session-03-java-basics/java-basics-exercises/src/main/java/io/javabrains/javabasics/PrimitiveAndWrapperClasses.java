package javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int primInt = 45;
        char primChar = 'A';
        double primDouble = 3456d;
        float primFloat = 987.34f;
        boolean primBool = false;
        // Step 2: Convert primitive variables to wrapper objects
        Integer wrapInt = Integer.valueOf(primInt);
        Character wrapChar = Character.valueOf(primChar);
        Double wrapDouble = Double.valueOf(primDouble);
        Float wrapFloat = Float.valueOf(primFloat);
        Boolean wrapBool = Boolean.valueOf(primBool);
        // Step 3: Print the values of the wrapper objects
        System.out.println("Wrapped Integer : "+wrapInt);
        System.out.println("Wrapped Character : "+wrapChar);
        System.out.println("Wrapped Double : "+wrapDouble);
        System.out.println("Wrapped Float: "+wrapFloat);
        System.out.println("Wrapped Boolean : "+wrapBool);
        // Step 4: Convert wrapper objects back to primitive variables
        int backToInt = wrapInt.intValue();
        char backToChar = wrapChar.charValue();
        double backToDouble = wrapDouble.doubleValue();
        float backToFloat = wrapFloat.floatValue();
        boolean backToBool = wrapBool.booleanValue();

        // Step 5: Print the values of the primitive variables
        System.out.println("Back to int : "+backToInt);
        System.out.println("Back to char : "+backToChar);
        System.out.println("Back to double : "+backToDouble);
        System.out.println("Back to float: "+backToFloat);
        System.out.println("boolean : "+backToBool);
    }
}
