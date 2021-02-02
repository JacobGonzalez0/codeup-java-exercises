package src;
import src.Person;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();

        int count = 0;

        for(Person person : people){
            switch(count){
                case 0: person.setName("Jacob");
                break;
                case 1: person.setName("Edward");
                break;
                case 2: person.setName("Gonzalez");
                break;
                default: person.setName("Bob");
                break;
            }
            count++;
        }

        people = addPerson(people,"Rainbow");

        for(Person person: people){
            System.out.println(person.getName());
        }

    }

    static public Person[] addPerson(Person[] input, String Name){
        Person[] output = new Person[input.length+1];
        int count = 0;
        for(Person person : input){
            output[count] = new Person();
            output[count].setName(person.getName());
            count++;
        }
        output[input.length] = new Person();
        output[input.length].setName(Name);

        return output;
    }
}
