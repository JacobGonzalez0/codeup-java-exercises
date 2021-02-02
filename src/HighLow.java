package src;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int num = (int) Math.floor(Math.random() * 100);
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1-100: ");
        int guess = input.nextInt();
        int tries = 1;

        while(num != guess){
            if(guess < num){
                System.out.println("guess higher! :");
            }else{
                System.out.println("guess lower! :");
            }
            guess = input.nextInt();
            tries++;
        }
        System.out.println("Good Guess!, you got it after " + tries + " tries!");
    }
}
