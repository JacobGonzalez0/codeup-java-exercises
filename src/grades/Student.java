package src.grades;

import java.util.ArrayList;
import java.util.Random;


public class Student {
    private ArrayList<Double> grades;
    private String name;
    private static Random rand;

    Student(String n){
        this.name = n;
        rand = new Random();
    }

    public String getName(){
        return name;
    }

    public void addRandomGrades(){
        for(int i = 0; i < 10;i++){
            addGrade( (double) rand.nextInt(100) );
        }
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(double grade: grades){
            total += grade;
        }
        return total / grades.size();
    }
}
