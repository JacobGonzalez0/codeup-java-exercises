package src;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Loop Basics
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }

        for(i = 5;i <= 15;i++){
            System.out.println(i);
        }

        float o = 2;
        do {
            System.out.println(o);
            o *= o;
        } while (o <= 1000000);

        for(o = 2;o <= 1000000;o *= o){
            System.out.println(o);
            
        }

        //Fizzbuzz
        int c = 0;
        for(;c <= 100;c++){
            if(c == 0)continue;
            if(c%3==0 && c%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(c%3==0){
                System.out.println("Fizz");
            }
            if(c%5==0){
                System.out.println("Buzz");
            }

        }

        //Table of powers
        Scanner input = new Scanner(System.in);
        
        System.out.println("What number would you like to go up to? ");
        int n = input.nextInt();

        System.out.println("Here is your table! ");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");


        for(int b = 0; b <= n;b++){

            System.out.println(b + "      | " + b*b + "       | " + b*b*b);

        }

        //Convert Grades
        boolean running = true;

        while(running){
            System.out.println("What grade do you have? ");
            gradeCheck(input.nextInt());

            System.out.println("Would you like to continue? (Y/N)");
            char con = input.next().charAt(0);
            if(Character.toLowerCase(con) == 'n'){
                running = false;
            }
        }
        

        
        
    }

    public static void gradeCheck(int input){
        if(input > 88){
            System.out.println("A");
            return;
        }
        if(input > 80){
            System.out.println("B");
            return;
        }
        if(input > 67){
            System.out.println("C");
            return;
        }
        if(input > 60){
            System.out.println("D");
            return;
        }
        System.out.println("F");
    }
}
