package src;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World.");

        int myFavoriteNumber = 23;
        String myString = "This is a string";
        //myString = 3.14159;
        
        
        // long myNumber;
        //System.out.println(myNumber);
        //myNumber = 3.14 ;
        // myNumber = 123L;
        float myNumber;
        myNumber = 3.14f;

        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        // int class ;

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int userInput = input.nextInt();
        System.out.println(userInput);

        System.out.println("Enter an String: ");
        String stringInput = input.nextLine();
        System.out.println(stringInput);




    }
}
