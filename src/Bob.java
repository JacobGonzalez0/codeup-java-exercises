import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Bob stands in front of you, what do you say?");
        while(running){
            String response = input.nextLine();
            if(response.isEmpty()){
                System.out.println("Fine. Be that way!");
                continue;
            }
            switch(response.charAt(response.length()-1)){
                case '?': System.out.println("Sure.");
                    break;
                case '!': System.out.println("Whoa, chill out!");
                    break;
                default: System.out.println("Whatever");
                    break;
            }
        }
    }
    
}
