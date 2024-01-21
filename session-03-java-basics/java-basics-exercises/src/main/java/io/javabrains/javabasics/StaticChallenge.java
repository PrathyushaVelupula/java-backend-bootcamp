package main.java.io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {
    public static class Rectangle{
        private double width,height;
        private static int numOfRectangles = 0;
        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
            numOfRectangles++;
        }
        public double getArea(){
            return width*height;
        }
        public double getPerimeter(){
            return  2*(width+height);
        }
        public static int getNumOfRectangles(){
            return numOfRectangles;
        }

    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12,5);
        Rectangle rectangle2 = new Rectangle(65,100);
        Rectangle rectangle3 = new Rectangle(23,20);
        System.out.println("Rectangle 1 area is "+rectangle1.getArea()+"perimeter is "+rectangle1.getPerimeter());
        System.out.println("Rectangle 2 area is "+rectangle2.getArea()+"perimeter is "+rectangle2.getPerimeter());
        System.out.println("Rectangle 3 area is "+rectangle3.getArea()+"perimeter is "+rectangle3.getPerimeter());

        System.out.println("Number of Rectangles created are "+Rectangle.getNumOfRectangles());
    }
}
