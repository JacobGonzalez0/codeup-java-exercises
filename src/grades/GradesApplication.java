package src.grades;
import src.util.Input;

import java.util.HashMap;

public class GradesApplication {
    
    private static HashMap <String, Student> students;
    private static Input ih ;
    public static void main(String[] args) {
        students = new HashMap<>();
        ih = new Input();

        students.put("Test",new Student("Test User"));
        
        for(Student student: students.values()){
            student.addRandomGrades();
        }

        System.out.println("Welcome!");
        System.out.println("");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("");

        
        for( String key : students.keySet()){
            System.out.print("|"+key+"| ");
        }

        askStudent();
        
    }

    public static void askStudent(){
        System.out.println("");
        System.out.println("What student would you like to see more information on?");
        System.out.println("");

        String answer = ih.getString();

        if(students.get(answer) == null){
            System.out.println("");
            System.out.println("Cant find the student named " + answer);
            askStudent();
        }else{
            Student data = students.get(answer);
            System.out.println("Name:" + data.getName() + " - GitHub Username: " + answer);
            System.out.println("Current Average: " + data.getGradeAverage());
            System.out.println("");
            System.out.println("Would you like to see another student? (Y/N)");
            System.out.println("");

            
            
            if(ih.yesNo()){
                askStudent();
            }else{
                System.err.println("Goodbye, have a great day!");
            }

        }
    }
}
