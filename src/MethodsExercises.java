import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        diceRoll();
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(0, 10);
        System.out.println(userInput);

        System.out.println("The factorial of " + userInput + " is: " + Factorial(userInput));

    }

    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
    public static int Multiplication(int a, int b){
        return a * b;
    }
    public static int Division(int a, int b){
        return a / b;
    }
    public static int Modulus(int a, int b){
        return a % b;
    }

    public static int Factorial(int input){
        int i, value = 1;
        for(i = 1; i<=input;i++){
            value = value * i;
        }
        return value;
    }

    public static int generateInteger(int min, int max){
        int number = (int) Math.floor((Math.random() * max)) + min;
        return number;
    }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        if(n >= min && n <= max){
            return n;
        }else{
            System.out.println("Please try again, 1 though 10: ");
        }
        return getInteger(min, max);
        
    }

    public static void diceRoll(){
        boolean rolling = true;
        while(rolling){

            System.out.println("How many sides are on the dice?");
            Scanner input = new Scanner(System.in);
            int sides = input.nextInt();
            
            System.out.println("You rolled a " + generateInteger(1,sides) + " and a " + generateInteger(1,sides));
            System.out.println("Roll again (Y/N)?");
            String con = input.next();

            if(con.charAt(0) != 'n'){
                continue;
            }
            rolling = false;

        }
    }



}
