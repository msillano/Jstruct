/*
 *from:
 * pag. 423 Example 14.7-1. Labels and Identifiers
 * note: code fragment, not compilable
 * 1) import  test04.java in JStruct
 * 2) export from JSTRUCT in test04_a.java
 * 3) compare test04.java and test04_a.java
 */



/**
* Java Program to demonstrate use of default method in Java 8.
 * You can define non-abstract method by using default keyword, and more
 * than one default method is permitted, which allows you to ship default skeletal
* implementation on interface itself.
*
* @author Javin Paul
*/

 class Test06{

    public static void main(String args[]) {

        // Implementing interface using Anonymous class
        Multiplication product = new Multiplication(){

            @Override
            public int multiply(int x, int y){
                return x*y;
            }
        };

        int squareOfTwo = product.square(2);
        int cubeOfTwo = product.cube(2);

        System.out.println("Square of Two : " + squareOfTwo);
        System.out.println("Cube of Two : " + cubeOfTwo);

        // Since Multiplication has only one abstract method, it can
        // also be implemented using lambda expression in Java 8

        Multiplication lambda = (x, y) -> x*y;

        int squareOfThree = lambda.square(3);
        int cubeOfThree = lambda.cube(3);

        System.out.println("Square of Three : " + squareOfThree);
        System.out.println("Cube of Three : " + cubeOfThree);

    }

}

interface Multiplication{
    int multiply(int a, int b);

    default int square(int a){
        return multiply(a, a);
    }

    default int cube(int a){
        return multiply(multiply(a, a), a);
    }
}


