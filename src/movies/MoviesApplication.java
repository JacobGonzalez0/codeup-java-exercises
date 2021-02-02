package src.movies;
import src.movies.*;
import src.util.*;

public class MoviesApplication {
    private static Input ih;
    private static Boolean running;
    public static void main(String[] args) {
        ih = new Input();

        running = true;

        while(running){

            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("");
            System.out.println("Enter your choice:");

            int choice = ih.getInt(0, 5);

            switch(choice){
                case 0: System.out.println("Goodbye!");
                    running = false;
                break;
                case 1: 
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                default: System.out.println("Invalid choice");
                break;
            }

        }

        
    }


    public void getMoviesCat(String c){
            
        
    }
}
