package src;

public class ServerNameGenerator {
    
    private static String[] list1;
    private static String[] list2;
    public static void main(String[] args) {
        list1 = new String[10];
        list2 = new String[10];

  
        generateNames();
        System.out.println("Here is your sever name:");
        System.out.println( list1[generateInteger(0,9)] + "-" + list2[generateInteger(0,9)]);

    }

    public static int generateInteger(int min, int max){
        int number = (int) Math.floor((Math.random() * max)) + min;
        return number;
    }

    public static void generateNames(){
        
        list1[0] = "colossal"; 
        list1[1] = "domineering";
        list1[2] = "cloudy";
        list1[3] = "cagey";
        list1[4] = "curious";
        list1[5] = "evanescent";
        list1[6] = "curly";
        list1[7] = "obscene";
        list1[8] = "delightful";
        list1[9] = "hard";
        
        list2[0] = "attention";
        list2[1] = "device";
        list2[2] = "college";
        list2[3] = "estate";
        list2[4] = "priority";
        list2[5] = "independence";
        list2[6] = "promotion";
        list2[7] = "shopping";
        list2[8] = "people";
        list2[9] = "thanks";
        
    }
    
}
