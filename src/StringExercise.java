package src;

public class StringExercise {
    public static void main(String[] args) {

        //String Basics
        String goshThisIsReallyLong = "We don't need no education : We don't need no thought control : Check \"this\" out!, \"s inside of \"s! : In windows, the main drive is usually C:\\ : I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";

        System.out.println(goshThisIsReallyLong.substring(0,27));
        System.out.println(goshThisIsReallyLong.substring(29,62));
        System.out.println(goshThisIsReallyLong.substring(64,100));
        System.out.println(goshThisIsReallyLong.substring(102,144));
        System.out.println(goshThisIsReallyLong.substring(146,231));


    }
}
