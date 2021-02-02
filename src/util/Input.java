import java.util.Scanner;

class InputTest{

    public static void main(String[] args) {
        Inputc iH = new Inputc();
        System.out.println("What is your name?");
        String input = iH.getString();
        System.out.println("Hi " + input);

        System.out.println("You know how to code??");
        Boolean truth = iH.yesNo();
        if(truth){
            System.out.println("Thats cool.");
        }else{
            System.out.println("You can learn.");
        }

        System.out.println("Fave number between 1-10?");
        int num = iH.getInt(1,10);

        System.out.println("Nice, " + num + " is my fav too!");

        System.out.println("Another one higher than that?");
        num = iH.getInt();
        System.out.println(num + "is a pretty good one too");

        

        return;
    }

}

class Inputc {

    private Scanner _input = new Scanner(System.in);

    String getString(){
        return _input.nextLine();
    }

    Boolean yesNo(){
        String answer = _input.nextLine();
        if(!answer.isEmpty() ){
            return yesNo();
        }else if(answer.toLowerCase().charAt(0) == 'n'){
            return false;
        }else{
            return true;
        }
    }

    int getInt(){
        
        return _input.nextInt();

    }

    int getInt(int min, int max){
        
        int n = _input.nextInt();

        if(n >= min && n <= max){
            return n;
        }else{
            return getInt(min,max);
        }
    }

    double getDouble(double min, double max){
        double n = Double.parseDouble(_input.nextLine());

        if(n >= min && n <= max){
            return n;
        }else{
            return getDouble(min,max);
        }
    }

    double getDouble(){
        return Double.parseDouble(_input.nextLine());
    }

}
